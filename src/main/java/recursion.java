/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author steve
 */
public class recursion {

    static int arr[] = {12, 34, 64, 23};

    public recursion() {
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }

    }

    //un metodo que logra buscar un valor x wn un array
    public static int buscarElmento(int arr[], int i, int n, int f) {
        if (f < 1) {
            return -1;}
            if (arr[i] == n) {
                return 1;
            }
                if (arr[i] == n) {
                    return n;

                } else {
                      return buscarElmento(arr, 1 + i, n, f - 1);
                }
              
            }
        }
