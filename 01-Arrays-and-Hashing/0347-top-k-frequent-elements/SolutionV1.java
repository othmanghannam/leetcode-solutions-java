import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Compter les fréquences de chaque nombre
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Min-Heap trié par fréquence croissante
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        for (int key : map.keySet()) {
            pq.offer(key);
            if (pq.size() > k) {
                pq.poll(); // Retire le moins fréquent
            }
        }

        // 3. Construire le tableau résultat
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        return result;
    }
}