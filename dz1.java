package sem2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

 /* Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.*/

public class dz1 {
    public static int[] sortArray(int[] array) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(dz1.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        String msg;
        int temp;
        int count = 0;        
        for (int i = array.length - 1; i >= 1; i--) {
            
            for (int j = 0; j < i; j++) {
                count++;
                msg = "Итерация № " + count + "\n" 
                        + "Массив сейчас такой: " + Arrays.toString(array) + "\n";
                logger.info(msg);
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        } return array;
    }

    public static void main(String[] args) throws SecurityException, IOException {
        int[] array = {-4, 2, 154, 0, 11, 17, -10, 3};
        sortArray(array);
    }
}
