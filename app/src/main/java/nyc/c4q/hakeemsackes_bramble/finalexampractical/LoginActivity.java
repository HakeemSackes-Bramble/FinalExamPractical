package nyc.c4q.hakeemsackes_bramble.finalexampractical;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by hakeemsackes-bramble on 2/12/17.
 */

public class LoginActivity extends AppCompatActivity {

    EditText editPassword;
    EditText editUsername;
    Button buttonSubmit;
    Context context;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editPassword = (EditText) findViewById(R.id.password);
        editUsername = (EditText) findViewById(R.id.username);
        buttonSubmit =(Button) findViewById(R.id.submit_button);
        context = getApplicationContext();

    }

    public void submitButton(View v){
        if((editUsername.getText()+"").equals("") && (editPassword.getText()+"").equals("")){

            Toast.makeText(context, "Enter username and password", Toast.LENGTH_SHORT).show();
        }else if((editUsername.getText()+"").equals("")){
            Toast.makeText(context, "Enter username", Toast.LENGTH_SHORT).show();
        }else if((editPassword.getText()+"").equals("")){
            Toast.makeText(context, "Enter password", Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
            startActivity(intent);
        }
        System.out.println(editUsername.getText());
    }

}
