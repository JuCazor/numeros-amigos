package app.numerosamigos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnVerificar = findViewById(R.id.btnVerificar);
        final EditText txtnumeroUno = findViewById(R.id.txtnumeroUno);
        final EditText txtnumeroDos = findViewById(R.id.txtnumeroDos);
        final TextView txtnumerosAmigos = findViewById(R.id.txtnumerosAmigos);


        btnVerificar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int suma = 0;
                int i;
                int num1 = Integer.parseInt(txtnumeroUno.getText().toString());
                int num2 = Integer.parseInt(txtnumeroDos.getText().toString());

                for(i=1;i<num1;i++){  // for para sumar todos los divisores propios de n1
                    if(num1%i==0){
                        suma=suma+i;
                    }
                }
                // si la suma de los divisores de n1 es igual a n2
                if(suma==num2){
                    suma=0;
                    for(i=1;i<num2;i++){  // sumo los divisores propios de n2
                        if(num2%i==0){
                            suma=suma+i;
                        }
                    }
                    // si la suma de los divisores de n2 es igual a n1
                    if(suma==num1){
                        txtnumerosAmigos.setText("Son Numeros Amigos");
                    }else{
                        txtnumerosAmigos.setText("No Son Numeros amigos");
                    }
                }
                else{
                    txtnumerosAmigos.setText("No Son Numeros Amigos");
                }
            }


        });


    }
}
