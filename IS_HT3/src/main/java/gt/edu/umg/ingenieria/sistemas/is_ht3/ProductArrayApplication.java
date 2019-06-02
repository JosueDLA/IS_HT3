package gt.edu.umg.ingenieria.sistemas.is_ht3;

import java.util.Arrays;

public class ProductArrayApplication {

    public static void main(String[] args) {
        // TODO code application logic here
        
        long[] input0 = new long[]{4,5,6,7,8};
        long[] input1 = new long[]{1,2,3,4,5,6};
        long[] input2 = new long[]{};
        long[] input3 = new long[]{0};
        long[] input4 = new long[]{1};
        long[] input5 = new long[]{5,1};
        long[] input6 = null;
        long[] input7 = new long[0];
        long[] input8 = new long[]{1, 2, 0, 0, 5};
        long[] input9 = new long[]{0, 2, 3, 4, 5};
        
        System.out.println("Probando: " + Arrays.toString(input0) + " - Resultado: " + Arrays.toString(calculateProductArrayBasic(input0)));
        System.out.println("Probando: " + Arrays.toString(input1) + " - Resultado: " + Arrays.toString(calculateProductArrayBasic(input1)));
        System.out.println("Probando: " + Arrays.toString(input2) + " - Resultado: " + Arrays.toString(calculateProductArrayBasic(input2)));
        System.out.println("Probando: " + Arrays.toString(input3) + " - Resultado: " + Arrays.toString(calculateProductArrayBasic(input3)));
        System.out.println("Probando: " + Arrays.toString(input4) + " - Resultado: " + Arrays.toString(calculateProductArrayBasic(input4)));
        System.out.println("Probando: " + Arrays.toString(input5) + " - Resultado: " + Arrays.toString(calculateProductArrayBasic(input5)));
        System.out.println("Probando: " + Arrays.toString(input6) + " - Resultado: " + Arrays.toString(calculateProductArrayBasic(input6)));
        System.out.println("Probando: " + Arrays.toString(input7) + " - Resultado: " + Arrays.toString(calculateProductArrayBasic(input7)));
        System.out.println("Probando: " + Arrays.toString(input8) + " - Resultado: " + Arrays.toString(calculateProductArrayBasic(input8)));
        System.out.println("Probando: " + Arrays.toString(input9) + " - Resultado: " + Arrays.toString(calculateProductArrayBasic(input9)));
    }
    
    public static long[] calculateProductArrayBasic(long[] input){
        if(input == null)
            return input;
        
        if(input.length == 1)
            return new long[]{1};
        
        long[] copy;
        long[] output = new long[input.length];
        
        for(long i=0; i<input.length; i++){
            int index = (int) i;
            
            if(index == 0){
                copy = Arrays.copyOfRange(input, index+1, input.length);
            }

            else if(index == input.length){
                copy = Arrays.copyOfRange(input, 0, index-1);
            }
            
            else{
                long[] temp1 = Arrays.copyOfRange(input, 0, index);
                long[] temp2 = Arrays.copyOfRange(input, index+1, input.length);

                copy = new long[temp1.length + temp2.length];

                System.arraycopy( temp1, 0, copy, 0, temp1.length);
                System.arraycopy( temp2, 0, copy, temp1.length, temp2.length);
            }
            
            long result = Arrays.stream(copy).reduce(1, (subtotal, element) -> subtotal * element);
            //System.out.println(Arrays.toString(copy));
            //System.out.println(result);
            output[index] = result;
        }
        return output;
    }
}
