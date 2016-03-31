package iftikhar.danayal.uninotes;

/**
 * Created by danayal_94 on 01/04/16.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import iftikhar.danayal.uninotes.data.NoteItem;


public class NoteEditorActivity extends Activity{

    private NoteItem note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);

        Intent intent = this.getIntent();
        note = new NoteItem();
        note.setKey(intent.getStringExtra("key"));
        note.setText(intent.getStringExtra("text"));

        EditText edit = (EditText) findViewById(R.id.noteText);
        edit.setText(note.getText());
        edit.setSelection(note.getText().length());
    }
}
