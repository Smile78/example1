package com.example.basicviews                                      //для  инфы.-  текущий пакет/папка
/*
МОЦ_ТГУ_РМП_5 Никитин Андрей Сергеевич
Последовательный вывод строчек стихотворения, используя переопределения событий жизненного цикла активности
*/

import androidx.appcompat.app.AppCompatActivity                     //для  инфы.-  т импорт всмомогательных модулей - мы из них используем некторые функции
import android.os.Bundle
import android.util.Log



val TAG1 = "MainActivity"                                     // таг - нужен 1ым параметром для логов

var jstCount  : Int = 0                                         // счетчик - будет прибаляться при каждоом действии
// var ключ слово переменной - означает изменяемая
// jstCount -название
// Int - тип переменной  (хранятся числа)
// 0- значение переменной


//val jstCount2: Array<Int> = arrayOf(0,1,2,3,4,5,6,7,8,9)


val numbers: Array<String> = arrayOf(                           // создаем коллекцию "массив"
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


fun cnt():Int{  return jstCount++ }

//fun cnt():Int{
//    jstCount++
//    if  (jstCount<9) return jstCount
//    else {
//         jstCount=
//        return jstCount}
// }


class MainActivity : AppCompatActivity() {                        // для  инфы.-




    override fun onCreate(savedInstanceState: Bundle?) {        // для  инфы.-  "активность" -функция которая срабатывает  при ЗАПУСКЕ приложения
                                                                // для  инфы.-   override - ключ слово
                                                               // для  инфы.-   fun - показывает что это функция
                                                               //    тonCreate - название функции
                                                               // для  инфы.-     savedInstanceState: Bundle? - параметр передаваемый в функцию




        super.onCreate(savedInstanceState)                    // для  инфы.-
        setContentView(R.layout.activity_main)                // для  инфы.-

        Log.d(TAG1, numbers[cnt()])
        //Log.d(TAG1, numbers[jstCount++])
                                                                // вывод лога в консоль .
    }                                                           // 1ый парметр ТАГ .
                                                                // 2ой параметр строка из массива numbers
                                                                // в скобках [номер индекса в массиве]-
                                                                //  ++  каждый раз прибавляем к индексу единицу - чтобы в следующий раз была след строка



    override fun onStart() {                                    // "активность" -функция которая срабатывает  при СТАРТЕ приложения
        super.onStart()
         Log.d(TAG1, numbers[cnt()])
        //Log.d(TAG1, numbers[jstCount++])

    }

    override fun onRestart() {                                  //   при РЕСТАРТЕ
        super.onRestart()
        Log.d(TAG1, numbers[cnt()])
        //Log.d(TAG1, numbers[jstCount++])
    }

    override fun onResume() {                                   //   при ВОССТАНОВЛЕНИ
        super.onResume()
        Log.d(TAG1, numbers[cnt()])
        //Log.d(TAG1, numbers[jstCount++])

    }


    override fun onPause() {                                    //   при переходе в ПАУЗУ
        super.onPause()
        Log.d(TAG1, numbers[cnt()])
        //Log.d(TAG1, numbers[jstCount++])

    }

    override fun onStop() {                                     // при СТОП
        super.onStop()
        Log.d(TAG1, numbers[cnt()])
        //Log.d(TAG1, numbers[jstCount++])

    }

    override fun onDestroy() {                                  // при удалении
        super.onDestroy()
        Log.d(TAG1, numbers[cnt()])
        //Log.d(TAG1, numbers[jstCount++])

    }



}