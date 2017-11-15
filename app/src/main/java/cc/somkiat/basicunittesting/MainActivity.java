package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import cc.somkiat.basicunittesting.validate.EmailValidator;
import cc.somkiat.basicunittesting.validate.NameValidator;
import cc.somkiat.basicunittesting.validate.ValidateResult;

public class MainActivity extends AppCompatActivity {

    EditText userNameInput, emailInput;

    NameValidator nameValidator;
    EmailValidator emailValidator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameInput = findViewById(R.id.userNameInput);
        emailInput = findViewById(R.id.emailInput);

        nameValidator = new NameValidator();
        emailValidator = new EmailValidator();
    }

    public void onSaveClick(View view) {
        ValidateResult nameResult = nameValidator.validate(userNameInput.getText().toString());
        ValidateResult emailResult = emailValidator.validate(emailInput.getText().toString());

        if (!nameResult.isValid()) {
            Toast.makeText(this, nameResult.getMessage(), Toast.LENGTH_SHORT).show();
        }else if (!emailResult.isValid()) {
            Toast.makeText(this, emailResult.getMessage(), Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show();
        }
    }

    public void onRevertClick(View view) {
        userNameInput.setText("");
        emailInput.setText("");
    }
}
