import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding. btnAddition.setOnClickListener {
            calculations('+')
        }
        binding. btnSubtraction.setOnClickListener {
            calculations('-')
        }
        binding .btnMultiplication.setOnClickListener {
            calculations('x')
        }
        binding. btnDivision.setOnClickListener {
            calculations('/')
        }


    }

    fun calculations(operator: Char) {
        val num1 =binding.etNum1.text.toString().toDouble()
        val num2 =binding.etNum2.text.toString().toDouble()
        val answer = when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            'x' -> num1 * num2
            '/' -> num1 / num2
            else -> throw IllegalArgumentException("Invalid operator:$operator")


        }
        binding. tvAnswer.text = answer.toString()
    }
}






