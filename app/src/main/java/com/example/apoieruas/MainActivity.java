package com.example.apoieruas;

import android.graphics.Color;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.apoieruas.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    // Criação das Variaveis da animação
    TextView detailsText;
    RelativeLayout layout;

    TextView detailsText2;
    RelativeLayout layout2;

    private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Passando o binding dos layouts
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Definindo as cores da status bar e navigation bar
        getWindow().setStatusBarColor(Color.RED);
        getWindow().setNavigationBarColor(Color.RED);

        // Removendo a action bar padrão do aplicativo
        getSupportActionBar().hide();

        // Informando o ID da Nav View
        BottomNavigationView navView = findViewById(R.id.nav_view);

        // Passar cada ID de menu como um conjunto de IDs
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_mapa, R.id.navigation_morador, R.id.navigation_perfil)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);




       // Definindo os IDs das variaveis
        detailsText = findViewById(R.id.d1);
        layout = findViewById(R.id.missao);

        detailsText2 = findViewById(R.id.d2);
        layout2 = findViewById(R.id.visao);



    }
    // Definindo Animação nos métodos onClick dos CardView do FragmentHome
    public void expand(View view) {
        int v = (detailsText.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        detailsText.setVisibility(v);
    }

    public void expand2(View view) {
        int v = (detailsText2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        detailsText2.setVisibility(v);
    }



}