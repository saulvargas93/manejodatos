package mx.edu.tesoem.isc.sucv.pract7manejodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre;
    TextView lblContenido;
    ArrayList<String> Datos = new ArrayList<>();


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        GrabarInfo();

    }

    public void Grabar( View v ) {
        Archivos conexion = new Archivos();
        conexion.Agregar(txtNombre.getText().toString(),Datos);
        Datos= conexion.getDatos();
        if (conexion.Grabar(this,Datos){
            Toast.makeText(context:this, text :"se grabo el mensaje ", Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(this, text:"el mensaje no se grabo", Toast.LENGTH_SHORT).show();
            {

            }


        }
    }

    public void  GrabarInfo(){

        Archivos conexion = new Archivos();

        String dato="";

        if (conexion.VerifArcrch(this)){

            if (conexion.Leer(this)){

                Datos= conexion.getDatos();
                dato+=elemento +"\n";
                for (String elemento:Datos)
                lblContenido.setText();


            }

        }
        }
    }