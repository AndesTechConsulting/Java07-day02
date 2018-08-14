package org.andestech.learning.rfb18;

public class Main {

    public static void main(String[] args) {
	// write your code here

    // поток выполнения

    char data = 'y';

    if(data == 'y')
    {
        System.out.println("Ok!!!");
    }

    int N = 0;

    // ternary if op
    System.out.println("You have " + N + " apple" +
                (N==1?"":"s") + "."
        );

    //

data = 'n';
        if(data == 'y')
        {
            System.out.println("y! Ok!!!");
        }
        else if(data == 'n') {
            System.out.println("n! Ok!!!");
        }
        else if (data == 'm') {
            System.out.println("m! Ok!!!");
        }
        else {System.out.println("No one found!");}

// switch
        switch(data){

            case 'n':
                System.out.println("+n! Ok!!!");
                System.out.println("+n! Ok!!!");
                //...

                break;
            case 'm':  System.out.println("+m! Ok!!!"); break;
            case 'y':  System.out.println("+y! Ok!!!"); break;
            default:   System.out.println("+No one found!");

        }

 // cycles

            int j = 0;
            N = 5;

            while (true) {
                //if(j>10) break;
                System.out.println("(+)j=" + j);
                //j = j + 1;
                //j += 1;
                j++;
                if (j > N) break;
            }



 do{
     --j;
     System.out.println("(-)j=" + j);


 }
 while (j>0);

 // for

        for (j = 0; j < N ; j++) {

        }

//int i =1;

      out:  for (int i = 0; i < N ; i++) {
            for (int k = 0; k < N; k++)
            {
               //
                System.out.println("k,j=" + k + "," + j);
                // find()....
                if(k+j == 8) {
                    System.out.println("!! case found!");
                    break out;
                }
            }

        }

        for (int i = 0; i < N ; i++) {

        }

       // System.out.println(i);
    }



}



