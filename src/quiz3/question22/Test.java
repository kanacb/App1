package quiz3.question22;

public interface  GetSetGo {

    int count = 1;
}

public class Test {
public static void main(String[] args) {
    GetSetGo [] arr = new GetSetGo[5];

    // this is accessing thru the object
    //arr[0].count

    // this is accessing thru the static way
    //GetSetGo.count;

    for(GetSetGo obj : arr){
        int c = GetSetGo.count;
        System.err.println(++c);
       
    }
    System.err.println(GetSetGo.count);
}    
}
