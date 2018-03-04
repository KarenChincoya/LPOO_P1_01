/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1.programmingExercises;

/**
 *
 * @author Karen Velasco
 */
public class E7 {
    public static void main(String[] args) {
    Integer [][] a = {{1,22,1,0,0,0,0,0,0,0,0},
                                    {1,22,1,0,0,0,0,0,0,0,0},
                                    {1,6,10,6,1,0,0,0,0,0,0},
                                    {5,2,1,8,1,2,5,0,0,0,0},
                                    {1,3,1,2,1,8,1,2,1,3,1},
                                    {1,3,1,2,1,8,1,2,1,3,1}};
       for(int i=0;i<6;i++){
           for(int j=0;j<11;j++){
               if((j%2)==0){
                   for(int k=0;k<a[i][j];k++)
                       System.out.print("X");
               }else{
                   for(int k=0;k<a[i][j];k++)
                       System.out.print(" ");
               }
           }
           System.out.println("");
       }
    } 
}
