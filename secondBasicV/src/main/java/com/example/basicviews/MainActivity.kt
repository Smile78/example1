package com.example.basicviews
/*
1onCreate0   Душе очарованной снятся лазурные дали...
2onStart0    Нет сил отогнать неотступную грусти истому...
3onResume0   И рвётся душа, трепеща от любви и печали,

4onPause    В далёкие страны, незримые оку земному.
5onStop     Но время настанет, и, сбросив оковы бессилья,
6onDestroy  Воспрянет душа, не нашедшая в жизни ответа,
7onCreate1   Широко расправит могучие белые крылья
8onStart1    И узрит чудесное в море блаженства и света!
9onResume1   Автор: Мирра Лохвицкая
*/

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG1 = "MainActivity"                                      // таг - нужен 1ым параметром для логов

    var jstCount  : Int = 0                                         // счетчик - будет прибаляться при каждоом действии
                                                                    // var ключ слово переменной - означает изменяемая
                                                                    // jstCount -название
                                                                    // Int - тип переменной  (хранятся числа)
                                                                    // 0- значение переменной

    val numbers: Array<String> = arrayOf(                           // создаем коллекцию "массив/список"
            "1 Душе очарованной снятся лазурные дали...",           // потом будем брать построчно - по индексу
            "2 Нет сил отогнать неотступную грусти истому...",      // val  ключевое слово переменной - означает НЕизменяемая
            "3 И рвётся душа, трепеща от любви и печали,",          // numbers- название
            "4 В далёкие страны, незримые оку земному.",            // Array коллекция "массив"
            "5 Но время настанет, и, сбросив оковы бессилья,",      // <String>  - тип значений (хранятся Строки)
            "6 Воспрянет душа, не нашедшая в жизни ответа,",        // arrayOf  -функция заполнения массива -по одной строке в каждую ячейку - разделитель запятая
            "7 Широко расправит могучие белые крылья",
            "8 И узрит чудесное в море блаженства и света!",
            "9 Автор: Мирра Лохвицкая ",
    )




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {        //активность - при запуске приложения
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG1, numbers[jstCount++])                        // вывод лога в консоль .
    }                                                           // 1ый парметр ТАГ .
                                                                // 2ой параметр строка из массива numbers
                                                                // в скобках [номер индекса в массиве]-
                                                                //  ++  каждый раз прибавляем к индексу единицу - чтобы в следующий раз была след строка

    override fun onStart() {
        super.onStart()
        Log.d(TAG1, numbers[jstCount++])

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG1, numbers[jstCount++])
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG1, numbers[jstCount++])

    }


    override fun onPause() {
        super.onPause()
        Log.d(TAG1, numbers[jstCount++])

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG1, numbers[jstCount++])

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG1, numbers[jstCount++])

    }



}