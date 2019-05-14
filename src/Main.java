import java.io.*;
import java.util.*;


class Main {
    public static void main(String args[]) throws IOException {
        int virsuniuSkaicius;
        BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
        String line = reader.readLine();
        virsuniuSkaicius = Integer.parseInt(line);
        int[][] gretimumoMatrica = new int[virsuniuSkaicius][virsuniuSkaicius];
        for (int i = 0; i < virsuniuSkaicius; i++) {
            line = reader.readLine();
            for (int j = 0; j < virsuniuSkaicius; j++) {
                gretimumoMatrica[i][j] = Character.getNumericValue(line.charAt(j));
                System.out.print(line.charAt(j));
            }
            System.out.println();
        }
        for (int i = 0; i < virsuniuSkaicius; i++) {
            for (int j = 0; j < virsuniuSkaicius; j++) {
                if (gretimumoMatrica[i][j] == 1 && gretimumoMatrica[j][i] == 0) {
                    gretimumoMatrica[j][i] = 1;
                }
            }
        }
        Euler(gretimumoMatrica, virsuniuSkaicius);
    }

    private static void Euler(int[][] gretimumoMatrica, int virsuniusSkaicius){
        ArrayList<Integer> STEKAS = new ArrayList<>();
        ArrayList<Integer> CIKLAS = new ArrayList<>();
        int v = 0;
        Integer u = null;
        STEKAS.add(v);
        while(!STEKAS.isEmpty()){
            boolean hasNeighbours = false;
            v = STEKAS.get(STEKAS.size()-1);
            int i = 0;
            while(i < virsuniusSkaicius){
                if(gretimumoMatrica[v][i] == 1){
                    u = i;
                    gretimumoMatrica[v][i] = 0;
                    gretimumoMatrica[i][v] = 0;
                    hasNeighbours = true;
                    break;
                }
                i++;
            }
            if(hasNeighbours){
                STEKAS.add(u);
            } else {
                CIKLAS.add(STEKAS.get(STEKAS.size()-1));
                STEKAS.remove(STEKAS.size()-1);
            }
        }
        System.out.println(CIKLAS);

    }
} 