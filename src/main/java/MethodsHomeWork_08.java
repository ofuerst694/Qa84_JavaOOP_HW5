public class MethodsHomeWork_08 {
    public static void printCapitals(String s) {
        String[] ar = s.split(" ");//razdelipo probelam
        for (String st: ar) {
            System.out.println(st.charAt(0));
        }
        System.out.println();
    }
    /*
    s-> "Hello Course QA 84"
         01234 012345 01 01
         output:
         HCQ8
     */
  //Variante 1
    public static void printLastReverse(String s){
        String[] ar = s.split(" ");
        for(int i = ar.length-1; i >= 0; i--){
            int len = ar[i].length();
            System.out.println(ar[i].charAt(len-1));
        }
        System.out.println();
    }
  //Variante 2
    public static void printLastReverse1(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String st  = sb.toString();
        printCapitals(st);

    }
    //Variante 3
    public static void printLastReverse2(String s) {
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            char last = word.charAt(word.length() - 1);
            System.out.print(last);

        }
        System.out.println();
    }

//    public static void printLastReverse(String s)
//    s-> "Hello Course QA 84"
 //   split delet na slova string
//           0      1     2     3
//    ar-> [Hello][course][QA][84] _> sb.revers
//    output:
//    01
//    "84"  2-1 =1
//    01
//    "QA" 2-1 = 1
//    012345
//   "course"
//            "4Aeo


    public static String insertFrom(String s, int index, String ins){
        StringBuilder sb = new StringBuilder(s);
        sb.insert(index,ins);
        return sb.toString();

    }
/*
[Helllo world]
[my ]
index 6
 */


}

/*
     i
    0123456789
s->"ccbbbdddda"
return 5

currChar  =  'a'    maxChar = 'd'
currCount  =  1     maxCount = 4

s.indexOf('d')
 */