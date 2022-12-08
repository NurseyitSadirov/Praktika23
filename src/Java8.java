import java.util.*;
import java.util.function.Consumer;

public class Java8 {
    public static void main(String[] args) {
//        Java Collection: LinkedList Exercises [7 көнүгүү]
//        1. LinkedList тизменин биринчи элементин алуу үчүн Java программасын жазыңыз.
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list.get(0));
//        System.out.println(list);
//////        2. LinkedList тизменин акыркы элементин алуу үчүн Java программасын жазыңыз.
//        LinkedList<Integer> list1 = new LinkedList<>();
//        list1.add(7);
//        list1.add(6);
//        list1.add(5);
//        list1.add(4);
//        System.out.println(list1.getLast());
//        System.out.println(list1);
//
////        3. LinkedList тизмеде белгилүү бир элемент бар же жок экенин текшерүү үчүн Java программасын жаз.
//        LinkedList<Integer> list2 = new LinkedList<>();
//        list2.add(7);
//        list2.add(6);
//        list2.add(5);
//        list2.add(4);
//        System.out.println(list2.contains(6));
//        System.out.println(list2);
//
////        4. LinkedList тизмени массивдердин тизмесине которуу үчүн Java программасын жазыңыз.
//
//        LinkedList<String> list3 = new LinkedList<>();
//        list3.add("Nurseyit");
//        list3.add("Baiysh");
//        list3.add("Jenish");
//
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("Saltanat");
//        strings.add("Kanykei");
//        strings.add("Aigerim");
//
//        list3.addAll(strings);
//        System.out.println(list3);
//
////          5. Эки LinkedList тизмесин салыштыруу үчүн Java программасын жазыңыз.
//
//        LinkedList<String> str = new LinkedList<>(Arrays.asList("1", "2", "3"));
//        LinkedList<String> str1 = new LinkedList<>(Arrays.asList("1", "2", "3", "4"));
//
//        ListIterator<String> iterator = str.listIterator();
//        ListIterator<String> iterator1 = str1.listIterator();
//
//        boolean isTrue = false;
//        while (iterator.hasNext() && iterator1.hasNext()) {
//            if (Objects.equals(iterator.next(), iterator1.next())) {
//                isTrue = true;
//            } else isTrue = false;
//        }
//        System.out.println(isTrue);
//
//        Iterator<String> iterator = str.iterator();
//        Iterator<String> iterator1 = str.iterator();
//
//        }
////        6. LinkedList тизме бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
////
//            LinkedList<Integer> integers = new LinkedList<>();
//        System.out.println(integers.isEmpty());
////        7. LinkedList тизмедеги элементти алмаштыруу үчүн Java программасын жазыңыз.
////
//        LinkedList<Integer> list5 = new LinkedList<>();
//       list5.add(5);
//       list5.add(3);
//       list5.add(6);
//       list5.add(7);
//        System.out.println(list5);
//        for (int i = 0; i < list5.size()-1; i++) {
//        }
//        System.out.println();
////        __________________________________________________________________________________________
////
////        Java Collection: HashSet Exercises [12 көнүгүү]
//
//
//////        The Hash Set: [
////        new BankAccount("OPTIMA","41692222" "7000")
////        new BankAccount("KYRGYZSTAN","41691111" "5000")
////        new BankAccount("DEMIR","41693333" "9000")
////        new BankAccount("RSK","41694444" "100000")
//
//
//      Set<Bank > hashset = new HashSet<>();
//
//        hashset.add((new Bank("Kyrgyzstan",1111,30000)));
//        hashset.add((new Bank("Optima",2222,20000)));
//        hashset.add((new Bank("RSK",3333,10000)));
//
//
//////        1. Көрсөтүлгөн элементти HashSet топтомунун аягына кошуу үчүн Java программасын жазыңыз.
//
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        System.out.println(set);
//
//
//////        2. HashSet тизмедеги бардык элементтерди кайталоо үчүн Java программасын жазыңыз.
//
//            Set<String> football = new HashSet<>();
//            football.add("Messi");
//            football.add("Ronaldo");
//            football.add("Benzema");
//        System.out.println("football players = " + football);
//
//////        3. Белгиленген TreeSet топтомунун бардык элементтерин башка TreeSet топтомуна кошуу үчүн Java программасын жазыңыз.
//
//        TreeSet <Integer> treeSet2 = new TreeSet<>();
//        treeSet2.add(54);
//        treeSet2.add(2);
//        TreeSet <Integer> treeSet = new TreeSet<>();
//        treeSet.add(12);
//        treeSet.add(32);
//        treeSet.add(1);
//        treeSet.add(3);
//        treeSet.add(6);
//        treeSet.addAll(treeSet2);
//        System.out.println(treeSet);
//
//
//////        4. HashSet топтомун бошотуу үчүн Java программасын жазыңыз.
////
//////        5. HashSet топтомунун бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
////
//////        6. HashSet топтомун башка хэш топтомуна клондоо үчүн Java программасын жазыңыз.
//
//
//////        7. HashSet топтомун массивге айландыруу үчүн Java программасын жазыңыз.
//
//            HashSet<Integer> hashSet = new HashSet<>();
//            hashSet.add(44);
//            hashSet.add(34);
//            hashSet.add(45);
//            hashSet.add(23);
//        System.out.println(hashSet);
//        System.out.println(Arrays.toString(hashSet.toArray()));
//
//        LinkedList<Integer> integers1 = new LinkedList<>();
//        integers1.add(123);
//        integers1.add(234);
//        integers1.add(2);
//        Collections.sort(integers1);
//        System.out.println(integers1);
//        System.out.println(Arrays.toString(integers1.toArray()));
//
//
//////        8. HashSet топтомун трисет топтомуна айландыруу үчүн Java программасын жазыңыз.
////
//        Set<String>hashSet=new HashSet<>(Arrays.asList("Peaksoft","Space X","Google"));
//        Set<String>treeSet=new TreeSet<>();
//        System.out.println(hashSet);
//        treeSet.addAll(hashSet);
//        System.out.println(treeSet);
//
//////        9. HshSet топтомун List/ ArrayListке айландыруу үчүн Java программасын жазыңыз
//// .
//        Set<String> set1 = new HashSet<>();
//        set1.add("Spase");
//        set1.add("Facebook");
//        set1.add("IPhone");
//        set1.add("PeakSoft");
//        System.out.println(set1);
//        System.out.println("______________________________");
//        System.out.println("LinkedList");
//        LinkedList<String> list = new LinkedList<>(set1);
//        list.add("Tesla");
//        System.out.println(list);
//        System.out.println("______________________________");
//        System.out.println("ArrayList");
//        ArrayList<String> list1=new ArrayList<>(set1);
//        list1.add("Google");
//        list1.add("YouTube");
//        System.out.println(list1);
//        System.out.println("______________________________");
//
//////        10. Эки HashSet топтомун салыштыруу үчүн Java программасын жазыңыз.
//
//        HashSet <Integer> integerHashSet = new HashSet<>();
//        integerHashSet.add(1);
//        integerHashSet.add(2);
//        integerHashSet.add(3);
//        integerHashSet.add(4);
//        integerHashSet.add(5);
//
//        HashSet <Integer> integerHashSet1 =  new HashSet<>();
//        integerHashSet1.add(1);
//        integerHashSet1.add(2);
//        integerHashSet1.add(3);
//        integerHashSet1.add(4);
//        integerHashSet1.add(5);
//
//        System.out.println(integerHashSet.equals(integerHashSet1));
//
//
//////        11. Эки топтомду салыштыруу жана эки топтомдо бирдей элементтерди сактоо үчүн Java программасын жазыңыз.
//        HashSet <Integer> integerHashSet = new HashSet<>();
//        integerHashSet.add(1);
//        integerHashSet.add(2);
//        integerHashSet.add(3);
//        integerHashSet.add(4);
//        integerHashSet.add(5);
//
//        HashSet <Integer> integerHashSet1 =  new HashSet<>();
//        integerHashSet1.add(1);
//        integerHashSet1.add(2);
//        integerHashSet1.add(3);
//        integerHashSet1.add(4);
//        integerHashSet1.add(6);
//        System.out.println(integerHashSet.equals(integerHashSet1));
//        System.out.println(integerHashSet1.removeAll(integerHashSet));
//////        12. HashSet топтомунан бардык элементтерди алып салуу үчүн Java программасын жазыңыз.
//        HashSet <Integer> integerHashSet2 = new HashSet<>();
//        integerHashSet2.add(1);
//        integerHashSet2.add(2);
//        integerHashSet2.add(3);
//        integerHashSet2.add(4);
//        integerHashSet2.add(5);
//        integerHashSet2.clear();
//        System.out.println(integerHashSet2);
////        _____________________________________________________________________________________________
////
////        Java Collection: TreeSet Exercises [16 көнүгүүлөр]
////
//////        1. Жаңы TreeSet топтомун түзүү үчүн Java программасын жазыңыз, бир нече түстөрдү  кошуп, TreeSet топтомун басып чыгарыңыз.
//            Set<Integer > integers = new TreeSet<>();
//            integers.add(44);
//            integers.add(33);
//            integers.add(22);
//        System.out.println(integers);
//////        2. TreeSet топтомундагы бардык элементтерди кайталоо үчүн Java программасын жазыңыз.
//       // integers.forEach(System.out::println);
//////        3. Белгиленген TreeSet топтомунун бардык элементтерин башка TreeSet топтомуна кошуу үчүн Java программасын жазыңыз.
//            Set<Integer> set = new TreeSet<>();
//
//            integers.addAll(set);
//        System.out.println(integers);
//////        4. Берилген TreeSet топтомундагы элементтердин тескери иреттүү көрүнүшүн түзүү үчүн Java программасын жазыңыз.
//      TreeSet<Integer> set1 = new TreeSet<>();
//      set1.add(1);
//      set1.add(54);
//      set1.add(143);
//      set1.add(32);
//        System.out.println(set1.descendingSet());
////
//
//////        5. TreeSet топтомундагы биринчи жана акыркы элементтерди алуу үчүн Java программасын жазыңыз.
//        TreeSet<Integer> num = new TreeSet<>();
//        num.add(12);
//        num.add(32);
//        num.add(22);
//        System.out.println("num.first = " + num.first());
//        System.out.println("num.last = " + num.last());
//        System.out.println("num = " + num);
//
//////        6. TreeSet тизмегин башка TreeSet топтомуна клондоо(clone) үчүн Java программасын жазыңыэ
//                     TreeSet<Integer> num0 = new TreeSet<>();
//        System.out.println(num.clone());
//        System.out.println(num0.clone());
//////        7. TreeSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.
//
//        System.out.println( num.isEmpty());
//
////// 8. Эки TreeSet топтомун салыштыруу үчүн Java программасын жа
//   TreeSet<Integer> in = new TreeSet<>();
//   System.out.println(in.equals(num));
//
//////        9. Tree топтомундагы 7ден аз сандарды табуу үчүн Java программасын жаз.
//                TreeSet<Integer> itn = new TreeSet<>();
//                itn.add(2);
//                itn.add(5);
//                itn.add(6);
//                itn.add(9);
//        System.out.println(itn.headSet(7));
//        System.out.println(itn);
//////        10. Берилген элементтен чоң же ага барабар болгон TreeSet жыйындысынын элементин алуу үчүн Java программасын жазыңыз.
//
//        System.out.println(itn.ceiling(5));
//
//////        11. Берилген элементтен кичине же ага барабар болгон TreeSet топтомундагы элементти алуу үчүн Java программасын жазыңыз.
//
//        System.out.println(itn.floor(4));
//
//////      12. TreeSet топтомунун биринчи элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
//        System.out.println(itn.first());
//
//////        13. TreeSet топтомунун акыркы элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
//        System.out.println(itn.last());
//        itn.floor(itn.last());
//////        14. Берилген элементти TreeSet жыйындысынан алып салуу үчүн Java программасын жазыңыз.
//        itn.remove(9);
//
//
//    }
}}

