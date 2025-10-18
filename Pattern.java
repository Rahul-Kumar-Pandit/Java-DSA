import java.util.Scanner;

public class Pattern {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
    /* 
        A
        B C
        D E F
        G H I J
        K L M N O
     */
        // char ch = 'A';
        // for(int line = 1; line<=n; line++){
        //     for(int chars = 1; chars<=line; chars++){
        //         System.out.print(ch+" ");
        //         ch++;
        //     }
        //     System.out.println();
        // }
        
// * * * * *
// *       *
// *       *
// *       *
// * * * * *
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(i==0||j==0||i==n-1||j==n-1){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

//           *
//         * *
//       * * *
//     * * * *
//   * * * * *
        // for(int i=0; i<size; i++){
        //     for(int k=0; k<size-i; k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=0; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
        // for(int i=size; i>0; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
        // int num = 1;
        // for(int i=1; i<=size; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
        // for(int i=0; i<size; i++){
        //     for(int j=0; j<=i; j++){
        //     if((i+j)%2==0){
        //         System.out.print("1 ");
        //     }else{
        //         System.out.print("0 ");
        //     }
        //     }
        //     System.out.println();
        // }


// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *
        // for(int i=1; i<=size; i++){
        //     for(int x=1; x<=i; x++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1; j<=2*(size-i); j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=size-1; i>=1; i--){
        //     for(int y=1; y<=i; y++){
        //         System.out.print("* ");
        //     }
        //     for(int l=1; l<=2*(size-i); l++){
        //         System.out.print("  ");
        //     }
        //     for(int m=1; m<=i; m++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

//          * * * * *
//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
        // for(int i=1; i<=size; i++){
        //     for(int j=1; j<=(size-i); j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=1; k<=size; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

//          * * * * *
//         *       *
//       *       *
//     *       *
//   * * * * *
        // for(int i=1; i<=size; i++){
        //     for(int j=1; j<=(size-i); j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=1; k<=size; k++){
        //         if(i==1||k==1||i==size||k==size){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

//           *
//         * * *
//       * * * * *
//     * * * * * * *
//     * * * * * * *
//       * * * * *
//         * * *
//           *
        // for(int i=1; i<=size; i++){
        //         for(int j=1; j<=(size-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int k=1; k<=i; k++){
        //                 System.out.print("* ");
        //         }
        //         for(int l=2; l<=i; l++){
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // }
        // for(int i=size; i>=1; i--){
        //    for(int j=1; j<=(size-i); j++){
        //         System.out.print("  ");
        //    }
        //    for(int k=1; k<=i; k++){
        //         System.out.print("* ");
        //    }
        //    for(int l=1; l<i; l++){
        //         System.out.print("* ");
        //    }
        //    System.out.println();
        // }

//         1
//       2  2
//     3  3  3  
//   4  4  4  4
// 5  5  5  5  5
        // for(int i=1; i<=size; i++){
        //         for(int j=1; j<=(size-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int k=1; k<=i; k++){
        //                 System.out.print(i+"  ");
        //         }
        //         System.out.println();
        // }
        
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5
        // for(int i=1; i<=size; i++){
        //         for(int j=1; j<=(size-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int k=i; k>=1; k--){
        //                 System.out.print(k+ " ");
                        
        //         }
        //         for(int l=2; l<=i; l++){
        //                 System.out.print(l+" ");
        //         }
        //         System.out.println();
        // }

// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *
        // for(int i=size; i>=1; i--){
        //         for(int k=1; k<=i; k++){
        //                 System.out.print("* ");
        //         }
        //         for(int j=1; j<=2*(size-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int l=1; l<=i; l++){
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // }

//           1
//         1 2 1
//       1 2 3 2 1
//     1 2 3 4 3 2 1
        // for(int i=1; i<=size; i++){
        //         for(int j=1; j<=(size-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=i; j++){
        //                 System.out.print(j+" ");
        //         }
        //         for(int j=i-1; j>=1; j--){
        //                 System.out.print(j+" ");
        //         }
        //         System.out.println();
        // }

// 1 2 3 4 3 2 1
//   1 2 3 2 1
//     1 2 1
//       1
        // for(int i=size; i>=1; i--){
        //         for(int j=1; j<=(size-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=i; j++){
        //                 System.out.print(j+" ");
        //         }
        //         for(int j=i-1; j>=1; j--){
        //                 System.out.print(j+" ");
        //         }
        //         System.out.println();
        // }

        // ************************//


        // for(int i=size; i>=1; i--){
        //         for(int j=1; j<=i; j++){
        //                 System.out.print(j+" ");
        //         }
        //         for(int j=1; j<=(2*(size-i))-1; j++){
        //                 System.out.print("  ");
        //         }               
        //         for(int j=i; j>=1; j--){
        //                 System.out.print(j+" ");
        //         }
        //         System.out.println();
        // }


//           A
//         A B A
//       A B C B A
//     A B C D C B A
        // for(int i = 1; i<=size; i++){
        //         for(int j=1; j<=(size-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=i; j++){
        //                 System.out.print((char)(j+64)+" ");
        //         }
        //         for(int j=i-1; j>=1; j--){
        //                 System.out.print((char)(j+64)+" ");
        //         }
        //         System.out.println();
        // }

// A B C D C B A
//   A B C B A
//     A B A
//       A
        // for(int i=size; i>=1; i--){
        //         for(int j=1; j<=(size-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=i; j++){
        //                 System.out.print((char)(j+64)+" ");
        //         }
        //         for(int j=i-1; j>=1; j--){
        //                 System.out.print((char)(j+64)+" ");
        //         }
        //         System.out.println();
        // }

        // **********************************//

        // for(int i=size; i>=1; i--){
        //         for(int j=1; j<=i; j++){
        //                 System.out.print((char)(j+64)+" ");
        //         }
        //         for(int j=1; j<=2*(size-i)-1; j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=i; j>=1; j--){
        //                 System.out.print((char)(j+64)+" ");
        //         }
        //         System.out.println();
        // }

        // *
        // * *
        // *   *
        // *     *
        // * * * * *
        // for(int i=1; i<=size; i++){
        //         for(int j=1; j<=i; j++){ 
        //                 if(i==1||j==i||i==size||j==1){
        //                         System.out.print("* ");                       
        //                 }else{
        //                         System.out.print("  ");
        //                 }
        //         }
        //         System.out.println();
        // }

//           *
//         * *
//       *   *
//     * * * *
        // for(int i=1; i<=size; i++){
        //         for(int j=1; j<=(size-i); j++){
        //         System.out.print("  ");
        //        }
        //        for(int j=1; j<=i; j++){
        //         if(i==1||j==size||i==size||j==1||j==i){
        //                 System.out.print("* ");
        //         }else{
        //                 System.out.print("  ");
        //         }
        //        }
        //        System.out.println();
        // }


//             *
//           *   *
//         *       *
//       *           *
//     *               *
//   *                   *
// * * * * * * * * * * * * *
        // for(int i=1; i<=size; i++){
        //         for(int j=1; j<=(size-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=(2*i)-1; j++){
        //                 if(i==1||j==1||i==size||j==(2*i-1)){

        //                         System.out.print("* ");                   
        //                 }else{
        //                         System.out.print("  ");
        //                 }   
        //         }                
        //         System.out.println(); 
        // }



        // ******************??

        for(int i=1; i<=size; i++){
                for(int j=1; j<=size; j++){
                        if(j==1||i==(size/2)+1 && j==(size/2)+1||j==size){
                                System.out.print("* ");
                        }
                        else{
                                System.out.print("  ");
                        }
                }
                System.out.println();
        }

        // for(int i=1; i<=size/2; i++){
        //         for(int j=1; j<=i; j++){
        //                 System.out.print("* ");
        //         }
        //         for(int j=1; j<=2*(size/2-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=i; j++){
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // }        
        sc.close();
    }
}
