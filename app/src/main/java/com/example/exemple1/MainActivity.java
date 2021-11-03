package com.example.exemple1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Office> myOffice = new ArrayList<Office>();
    private ListView mListeLV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListeLV =findViewById(R.id.MaListe);

        myOffice.add(new Office(R.drawable.photo1,"Word","Editeur du Texte"));
        myOffice.add(new Office(R.drawable.photo2,"Excel","Tableur"));
        myOffice.add(new Office(R.drawable.photo3,"Power Point","Logiciel de présentation"));
        myOffice.add(new Office(R.drawable.photo4,"Outlook","Client de courrier Electronique"));
        ArrayAdapter<Office> adapter = new OfficeAdapter();

        list.setAdapter(adapter);
    }
}
