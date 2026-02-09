package tw.edu.mcu.weiranzhu.memegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class InfoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Element adsElement = new Element();
        adsElement.setTitle("About page");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription("--Meme Generator Beta--")
                .addItem(new Element().setTitle("Version 0.2.1"))
                .addItem(adsElement)
                .addGroup("Connect with me")
                .addEmail("07360931@me.mcu.edu.tw")
                .addFacebook("shio.asanagi")
                .addInstagram("shio_weiran0630")
                .addGitHub("asanagishio")
                .addItem(createCopyright())
                .create();

        setContentView(aboutPage);
    }

    private Element createCopyright() {
        Element copyright = new Element();
        final String copyrightString = String.format("Copyright © %d Ming Chuan University Wei-ran Zhu", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InfoPage.this, copyrightString, Toast.LENGTH_SHORT).show();
            }
        });
        return  copyright;
    }
}