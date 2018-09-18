package teste;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class SlopeOne {
    static String[] mAllItems;
    Map<String, Map<String, Double>> mData;
    Map<String, Map<String, Double>> diffMatrix;
    Map<String, Map<String, Integer>> freqMatrix;

    public SlopeOne(Map<String, Map<String, Double>> data) {
        mData = data;
        buildDiffMatrix();
    }

    public static void main(String args[]) {
        // a base de dado
        Map<String, Map<String, Double>> data = new HashMap<>();
        // itens
        String movel1 = "movel1";
        String movel2 = "movel2";
        String movel3 = "movel3";
        String movel4 = "movel4";
        String movel5 = "movel5";
        String movel6 = "movel6";
        String movel7 = "movel7";

        mAllItems = new String[]{movel1, movel2, movel3, movel4, movel5, movel6, movel7};

        HashMap<String, Double> user1 = new HashMap<>();
        HashMap<String, Double> user2 = new HashMap<>();
        HashMap<String, Double> user3 = new HashMap<>();
        HashMap<String, Double> user4 = new HashMap<>();
        HashMap<String, Double> user5 = new HashMap<>();
        HashMap<String, Double> user6 = new HashMap<>();
        HashMap<String, Double> user7 = new HashMap<>();
        HashMap<String, Double> user8 = new HashMap<>();
        HashMap<String, Double> user9 = new HashMap<>();
        HashMap<String, Double> user10 = new HashMap<>();
        HashMap<String, Double> user11 = new HashMap<>();
        HashMap<String, Double> user12 = new HashMap<>();
        HashMap<String, Double> user13 = new HashMap<>();
        HashMap<String, Double> user14 = new HashMap<>();
        HashMap<String, Double> user15 = new HashMap<>();
        HashMap<String, Double> user16 = new HashMap<>();
        HashMap<String, Double> user17 = new HashMap<>();
        HashMap<String, Double> user18 = new HashMap<>();
        HashMap<String, Double> user19 = new HashMap<>();
        HashMap<String, Double> user20 = new HashMap<>();
        HashMap<String, Double> user21 = new HashMap<>();
        HashMap<String, Double> user22 = new HashMap<>();
        HashMap<String, Double> user23 = new HashMap<>();
        HashMap<String, Double> user24 = new HashMap<>();
        HashMap<String, Double> user25 = new HashMap<>();
        HashMap<String, Double> user26 = new HashMap<>();
        HashMap<String, Double> user27 = new HashMap<>();
        HashMap<String, Double> user28 = new HashMap<>();
        HashMap<String, Double> user29 = new HashMap<>();
        HashMap<String, Double> user30 = new HashMap<>();
        /*Inserindo os valores 1-10*/
        user1.put(movel1, 1.0);
        user1.put(movel2, 1.0);
        user1.put(movel3, 1.0);
        user1.put(movel4, 1.0);
        user1.put(movel5, 1.0);
        user1.put(movel6, 4.0);
        user1.put(movel7, 2.0);
        /*Carro 7: indica 1.2586207*/
        data.put("usuário 1", user1);
        user2.put(movel1, 3.0);
        user2.put(movel2, 4.0);
        user2.put(movel3, 1.0);
        user2.put(movel4, 5.0);
        user2.put(movel5, 5.0);
        user2.put(movel6, 5.0);
        user2.put(movel7, 4.3333335);
        /*--> indica 3.5689654*/
        data.put("usuário 2", user2);
        user3.put(movel1, 4.0);
        user3.put(movel2, 5.0);
        user3.put(movel3, 5.0);
        user3.put(movel4, 4.0);
        user3.put(movel5, 3.0);
        user3.put(movel6, 5.0);
        user3.put(movel7, 4.8333335);
        /*--> indica 4.086207*/
        data.put("usuário 3", user3);
        user4.put(movel1, 2.0);
        user4.put(movel2, 3.0);
        user4.put(movel3, 4.0);
        user4.put(movel4, 5.0);
        user4.put(movel5, 5.0);
        user4.put(movel6, 4.0);
        user4.put(movel7, 4.3333335);
        data.put("usuário 4", user4);
        user5.put(movel1, 5.0);
        user5.put(movel2, 5.0);
        user5.put(movel3, 5.0);
        user5.put(movel4, 5.0);
        user5.put(movel5, 5.0);
        user5.put(movel6, 5.0);
        user5.put(movel7, 5.0);
        data.put("usuário 5", user5);
        user6.put(movel1, 1.0);
        user6.put(movel2, 1.0);
        user6.put(movel3, 1.0);
        user6.put(movel4, 1.0);
        user6.put(movel5, 1.0);
        user6.put(movel6, 1.0);
        user6.put(movel6, 1.4000001);
        data.put("usuário 6", user6);
        user7.put(movel1, 3.0);
        user7.put(movel2, 4.0);
        user7.put(movel3, 2.0);
        user7.put(movel4, 5.0);
        user7.put(movel5, 3.0);
        user7.put(movel6, 5.0);
        user7.put(movel7, 4.0666666);
        data.put("usuário 7", user7);
        user8.put(movel1, 5.0);
        user8.put(movel2, 4.0);
        user8.put(movel3, 3.0);
        user8.put(movel4, 4.0);
        user8.put(movel5, 3.0);
        user8.put(movel6, 4.0);
        user8.put(movel7, 4.2333336);
        data.put("usuário 8", user8);
        user9.put(movel1, 5.0);
        user9.put(movel2, 4.0);
        user9.put(movel3, 3.0);
        user9.put(movel4, 4.0);
        user9.put(movel5, 3.0);
        user9.put(movel6, 4.0);
        user9.put(movel7, 4.2333336);
        data.put("usuário 9", user9);
        user10.put(movel1, 1.0);
        user10.put(movel2, 2.0);
        user10.put(movel3, 1.0);
        user10.put(movel4, 2.0);
        user10.put(movel5, 2.0);
        user10.put(movel6, 3.0);
        user10.put(movel7, 2.2333333);
        data.put("usuário 10", user10);
        /* Inserindo os valores 11-20*/
        user11.put(movel1, 3.0);
        user11.put(movel2, 4.0);
        user11.put(movel3, 1.0);
        user11.put(movel4, 3.0);
        user11.put(movel5, 5.0);
        user11.put(movel6, 2.0);
        user11.put(movel6, 3.4);
        data.put("usuário 11", user11);
        user12.put(movel1, 5.0);
        user12.put(movel2, 4.0);
        user12.put(movel3, 4.0);
        user12.put(movel4, 5.0);
        user12.put(movel5, 2.0);
        user12.put(movel6, 1.0);
        user12.put(movel7, 3.9);
        data.put("usuário 12", user12);
        user13.put(movel1, 5.0);
        user13.put(movel2, 4.0);
        user13.put(movel3, 4.0);
        user13.put(movel4, 5.0);
        user13.put(movel5, 2.0);
        user13.put(movel6, 1.0);
        user13.put(movel7, 3.9);
        data.put("usuário 13", user13);
        user14.put(movel1, 5.0);
        user14.put(movel2, 4.0);
        user14.put(movel3, 5.0);
        user14.put(movel4, 5.0);
        user14.put(movel5, 5.0);
        user14.put(movel6, 4.0);
        user14.put(movel7, 5.0);
        data.put("usuário 14", user14);
        user15.put(movel1, 3.0);
        user15.put(movel2, 3.0);
        user15.put(movel3, 2.0);
        user15.put(movel4, 2.0);
        user15.put(movel5, 1.0);
        user15.put(movel6, 2.0);
        user15.put(movel7, 2.5611112);
        data.put("usuário 15", user15);
        user16.put(movel1, 2.0);
        user16.put(movel2, 2.0);
        user16.put(movel3, 3.0);
        user16.put(movel4, 2.0);
        user16.put(movel5, 2.0);
        user16.put(movel6, 5.0);
        user16.put(movel7, 3.0611112);
        data.put("usuário 16", user16);
        user17.put(movel1, 1.0);
        user17.put(movel2, 1.0);
        user17.put(movel3, 2.0);
        user17.put(movel4, 1.0);
        user17.put(movel5, 1.0);
        user17.put(movel6, 1.0);
        user17.put(movel7, 1.5611112);
        data.put("usuário 17", user17);
        user18.put(movel1, 4.0);
        user18.put(movel2, 3.0);
        user18.put(movel3, 2.0);
        user18.put(movel4, 1.0);
        user18.put(movel5, 2.0);
        user18.put(movel6, 2.0);
        user18.put(movel7, 2.727778);
        data.put("usuário 18", user18);
        user19.put(movel1, 2.0);
        user19.put(movel2, 2.0);
        user19.put(movel3, 2.0);
        user19.put(movel4, 2.0);
        user19.put(movel5, 2.0);
        user19.put(movel6, 3.0);
        user19.put(movel7, 2.5611112);
        data.put("usuário 19", user19);
        user20.put(movel1, 5.0);
        user20.put(movel2, 4.0);
        user20.put(movel3, 4.0);
        user20.put(movel4, 5.0);
        user20.put(movel5, 5.0);
        user20.put(movel6, 4.0);
        user20.put(movel7, 4.8944445);
        data.put("usuário 20", user20);
        /* Inserindo os valores 21-30 */
        user21.put(movel1, 4.0);
        user21.put(movel2, 3.0);
        user21.put(movel3, 4.0);
        user21.put(movel4, 3.0);
        user21.put(movel5, 3.0);
        user21.put(movel6, 3.0);
        user21.put(movel7, 3.727778);
        data.put("usuário 21", user21);
        user22.put(movel1, 4.0);
        user22.put(movel2, 4.0);
        user22.put(movel3, 4.0);
        user22.put(movel4, 4.0);
        user22.put(movel5, 4.0);
        user22.put(movel6, 4.0);
        user22.put(movel7, 4.3944445);
        data.put("usuário 22", user22);
        user23.put(movel1, 2.0);
        user23.put(movel2, 3.0);
        user23.put(movel3, 2.0);
        user23.put(movel4, 1.0);
        user23.put(movel5, 4.0);
        user23.put(movel6, 5.0);
        user23.put(movel7, 3.227778);
        data.put("usuário 23", user23);
        user24.put(movel1, 4.0);
        user24.put(movel2, 3.0);
        user24.put(movel3, 5.0);
        user24.put(movel4, 2.0);
        user24.put(movel5, 2.0);
        user24.put(movel6, 1.0);
        user24.put(movel7, 3.227778);
        data.put("usuário 24", user24);
        user25.put(movel1, 5.0);
        user25.put(movel2, 3.0);
        user25.put(movel3, 4.0);
        user25.put(movel4, 5.0);
        user25.put(movel5, 5.0);
        user25.put(movel6, 2.0);
        user25.put(movel6, 4.3944445);
        data.put("usuário 25", user25);
        user26.put(movel1, 2.0);
        user26.put(movel2, 2.0);
        user26.put(movel3, 3.0);
        user26.put(movel4, 2.0);
        user26.put(movel5, 1.0);
        user26.put(movel6, 1.0);
        user26.put(movel7, 2.227778);
        data.put("usuário 26", user26);
        user27.put(movel1, 5.0);
        user27.put(movel2, 4.0);
        user27.put(movel3, 5.0);
        user27.put(movel4, 3.0);
        user27.put(movel5, 4.0);
        user27.put(movel6, 4.0);
        user27.put(movel7, 4.5611115);
        data.put("usuário 27", user27);
        user28.put(movel1, 2.0);
        user28.put(movel2, 1.0);
        user28.put(movel3, 2.0);
        user28.put(movel4, 1.0);
        user28.put(movel5, 1.0);
        user28.put(movel6, 1.0);
        user28.put(movel6, 1.727778);
        data.put("usuário 28", user28);
        user29.put(movel1, 4.0);
        user29.put(movel2, 5.0);
        user29.put(movel3, 3.0);
        user29.put(movel4, 3.0);
        user29.put(movel5, 2.0);
        user29.put(movel6, 3.0);
        user29.put(movel6, 3.727778);
        data.put("usuário 29", user29);
        user30.put(movel1, 2.0);
        user30.put(movel2, 2.0);
        user30.put(movel3, 1.0);
        user30.put(movel4, 2.0);
        user30.put(movel5, 1.0);
        user30.put(movel6, 1.0);
        user29.put(movel6, 1.8944446);
        data.put("usuário 30", user30);

        SlopeOne so = new SlopeOne(data);
        System.out.println("Resultado da Lista: ");
        SlopeOne.print(so.predict(user30));
    }

    public static void print(Map<String, Double> user) {
        for (String j : user.keySet()) {
            System.out.println(" " + j + " --> " + user.get(j).floatValue());
        }
    }


    /**
     * Based on existing data, and using weights,
     * try to predict all missing ratings.
     * The trick to make this more scalable is to consider
     * only mDiffMatrix entries having a large  (>1) mFreqMatrix
     * entry.
     * <p>
     * It will output the prediction 0 when no prediction is possible.
     */
    public Map<String, Double> predict(Map<String, Double> user) {
        HashMap<String, Double> predictions = new HashMap<>();
        HashMap<String, Integer> frequencies = new HashMap<>();
        for (String j : diffMatrix.keySet()) {
            frequencies.put(j, 0);
            predictions.put(j, 0.0);
        }
        for (String j : user.keySet()) {
            for (String k : diffMatrix.keySet()) {
                try {
                    Double newval = (diffMatrix.get(k).get(j) + user.get(j)) * freqMatrix.get(k).get(j).intValue();
                    predictions.put(k, predictions.get(k) + newval);
                    frequencies.put(k, frequencies.get(k) + freqMatrix.get(k).get(j).intValue());
                } catch (NullPointerException e) {
                }
            }
        }
        HashMap<String, Double> cleanpredictions = new HashMap<>();
        for (String j : predictions.keySet()) {
            if (frequencies.get(j) > 0) {
                cleanpredictions.put(j, predictions.get(j) / frequencies.get(j).intValue());
            }
        }
        for (String j : user.keySet()) {
            cleanpredictions.put(j, user.get(j));
        }
        return cleanpredictions;
    }

    public void buildDiffMatrix() {
        diffMatrix = new HashMap<>();
        freqMatrix = new HashMap<>();
        // first iterate through users
        for (Map<String, Double> user : mData.values()) {
            // then iterate through user data
            for (Entry<String, Double> entry : user.entrySet()) {
                String i1 = entry.getKey();
                double r1 = entry.getValue();

                if (!diffMatrix.containsKey(i1)) {
                    diffMatrix.put(i1, new HashMap<String, Double>());
                    freqMatrix.put(i1, new HashMap<String, Integer>());
                }

                for (Entry<String, Double> entry2 : user.entrySet()) {
                    String i2 = entry2.getKey();
                    double r2 = entry2.getValue();

                    int cnt = 0;
                    if (freqMatrix.get(i1).containsKey(i2)) cnt = freqMatrix.get(i1).get(i2);
                    double diff = 0.0;
                    if (diffMatrix.get(i1).containsKey(i2)) diff = diffMatrix.get(i1).get(i2);
                    double new_diff = r1 - r2;

                    freqMatrix.get(i1).put(i2, cnt + 1);
                    diffMatrix.get(i1).put(i2, diff + new_diff);
                }
            }
        }
        for (String j : diffMatrix.keySet()) {
            for (String i : diffMatrix.get(j).keySet()) {
                Double oldvalue = diffMatrix.get(j).get(i);
                int count = freqMatrix.get(j).get(i).intValue();
                diffMatrix.get(j).put(i, oldvalue / count);
            }
        }
    }
}
