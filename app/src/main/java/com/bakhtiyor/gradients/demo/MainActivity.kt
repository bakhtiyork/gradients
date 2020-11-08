package com.bakhtiyor.gradients.demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item?.itemId == R.id.menu_about) {
            AlertDialog.Builder(this)
                    .setTitle(R.string.app_name)
                    .setMessage(R.string.text_about)
                    .setNeutralButton(R.string.text_github) { dialog, which ->
                        dialog.dismiss()
                        val webpage = Uri.parse(getString(R.string.url))
                        val intent = Intent(Intent.ACTION_VIEW, webpage)
                        intent.resolveActivity(packageManager)?.let {
                            startActivity(intent)
                        }
                    }.setPositiveButton(android.R.string.ok) { dialog, which ->
                        dialog.dismiss()
                    }.show()
        }
        return super.onOptionsItemSelected(item)
    }
}
