package elrizo.com.facebook;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import elrizo.com.facebook.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;
private List<publicacionP> publicacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view  = binding.getRoot();
        setContentView(view);




        publicacion = new ArrayList<>();
        publicacion.add(new publicacionP("Luis Raul Rizo Gutierrez","2/12/2020",R.drawable.fotoperf3,"Esto cololocando un comentario",R.drawable.feliz));
        publicacion.add(new publicacionP("Luis Raul Rizo Gutierrez","2/12/2020",R.drawable.fotoperf3,"Este es una pruebita",R.drawable.public2));
        publicacion.add(new publicacionP("Luis Raul Rizo Gutierrez","2/12/2020",R.drawable.fotoperf3,"No carga nada :,b",R.drawable.enoj));




        binding.rclrPanel.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
    binding.rclrPanel.setLayoutManager(layoutManager);
    PublicacionAdapter adapter = new PublicacionAdapter(publicacion);
    binding.rclrPanel.setAdapter(adapter);

    }
}