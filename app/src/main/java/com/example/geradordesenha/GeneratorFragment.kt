package com.example.passwordgenerator

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.geradordesenha.R
import kotlin.random.Random

class GeneratorFragment : Fragment() {

    lateinit var passwordText: TextView
    lateinit var seekBar: SeekBar
    lateinit var lengthText: TextView
    lateinit var switchUpper: Switch
    lateinit var switchNumbers: Switch
    lateinit var switchSymbols: Switch

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_generator, container, false)

        passwordText = view.findViewById(R.id.passwordText)
        seekBar = view.findViewById(R.id.seekBar)
        lengthText = view.findViewById(R.id.lengthText)
        switchUpper = view.findViewById(R.id.switchUpper)
        switchNumbers = view.findViewById(R.id.switchNumbers)
        switchSymbols = view.findViewById(R.id.switchSymbols)

        val btnGenerate = view.findViewById<Button>(R.id.btnGenerate)
        val btnCopy = view.findViewById<Button>(R.id.btnCopy)

        seekBar.progress = 12
        lengthText.text = "Tamanho: 12"

        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val length = if(progress < 4) 4 else progress
                lengthText.text = "Tamanho: $length"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        btnGenerate.setOnClickListener {
            val password = generatePassword()
            passwordText.text = password
            MainActivity.passwordHistory.add(0,password)
        }

        btnCopy.setOnClickListener {
            val clipboard = requireActivity().getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("senha", passwordText.text.toString())
            clipboard.setPrimaryClip(clip)
            Toast.makeText(context,"Senha copiada!",Toast.LENGTH_SHORT).show()
        }

        return view
    }

    private fun generatePassword(): String{
        val lower = "abcdefghijklmnopqrstuvwxyz"
        val upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val numbers = "0123456789"
        val symbols = "!@#\$%&*"

        var chars = lower

        if(switchUpper.isChecked) chars += upper
        if(switchNumbers.isChecked) chars += numbers
        if(switchSymbols.isChecked) chars += symbols

        val length = if(seekBar.progress < 4) 4 else seekBar.progress

        return (1..length)
            .map { chars[Random.nextInt(chars.length)] }
            .joinToString("")
    }
}