package exercise2
import scala.annotation.tailrec
import scala.collection.immutable.List 
 /*
  * Реализуйте функции для решения следующих задач.
  * Примечание: Попытайтесь сделать все функции с хвостовой рекурсией, используйте аннотацию для подстверждения.
  * рекурсия будет хвостовой если:
  * 1. рекурсия реализуется в одном направлении
  * 2. вызов рекурсивной функции будет последней операцией перед возвратом
*/
object RecursiveFunctions  {

  def length[A](as: List[A]): Int = {
    @tailrec
    def loop(rem: List[A], agg: Int): Int = rem match {
      case x :: tail  => loop(tail, agg + 1)
      case Nil         => agg
    }

    loop(as, 0)
  }

  /* 
   * Напишите функцию которая записывает в обратном порядке список:
   * def reverse[A](list: List[A]): List[A]
   */
  def reverse[A](list: List[A]): List[A] = {
    @tailrec
    def loop(rem: List[A], result: List[A]): List[A] = rem match {
      case x :: tail  =>  loop(tail, x :: result)
      case Nil         => result
    }
    loop(list, Nil)
  }
  /*
   * Используйте функцию из пункта здесь, не изменяйте сигнатуру
   */
  def testReverse[A](list: List[A]): List[A] = reverse(list)

  /* 
   * Напишите функцию, которая применяет функцию к каждому значению списка:
   * def map[A, B](list: List[A])(f: A => B): List[B]
   */
  def Map[A, B](list: List[A])(f: A => B): List[B] = {
    @tailrec
    def loop(rem: List[A], result: List[B])(f: A => B): List[B] = rem match {
      case x :: tail => loop(tail, result :+ f(x))(f)
      case Nil       => result
    }
    loop(list, Nil)(f)
  }
  /*
   * Используйте функцию из пункта здесь, не изменяйте сигнатуру
   */
  def testMap[A, B](list: List[A], f: A => B): List[B] = Map(list)(f)
  
  /* 
   * Напишите функцию, которая присоединяет один список к другому:
   * def append[A](l: List[A], r: List[A]): List[A]
   */
  def Append[A](l: List[A], r: List[A]) : List[A] = {
    @tailrec
    def loop(rem: List[A], result: List[A]) : List[A] = rem match {
      case x :: tail => loop(tail, result :+ x)
      case Nil       => result
    }
    loop(r, l)
  }
  /*
   * Используйте функцию из пункта здесь, не изменяйте сигнатуру
   */
  def testAppend[A](l: List[A], r: List[A]): List[A] = Append(l, r)

  /* 
   * Напишите функцию, которая применяет функцию к каждому значению списка:
   * def flatMap[A, B](list: List[A])(f: A => List[B]): List[B]
   * 
   * она получает функцию, которая создает новый List[B] для каждого элемента типа A в 
   * списке. Поэтому вы создаете List[List[B]]. 
   */
  def FlatMap[A, B](list: List[A])(f: A => List[B]): List[B] = {
    @tailrec
    def loop(rem: List[A], result: List[B])(f: A => List[B]): List[B] = rem match {
      case x :: tail => loop(tail, result ++ f(x))(f)
      case Nil       => result
    }
    loop(list, Nil)(f)
  }
  /*
   * Используйте функцию из пункта здесь, не изменяйте сигнатуру
   */
  def testFlatMap[A, B](list: List[A], f: A => List[B]): List[B] = FlatMap(list)(f)

  /* 
   * Вопрос: Возможно ли написать функцию с хвостовой рекурсией для `Tree`s? Если нет, почему? 
   *
   * Нельзя написать функцию с хвостовой рекурсией для `Tree`s, так как хвостовая рекурсия - это
   * рекурсия в одном направлении, что не подходит для древовидной структуры
   */
}
