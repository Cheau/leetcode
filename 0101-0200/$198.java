/**
 * House Robber.
 */
public class $198 {

    public int rob(int[] nums) {
        int[] memory = new int[2];
        int cur = -1;
        for (int n : nums) {
            cur = (cur + 1) % 2;
            memory[cur] = Math.max(memory[cur] + n, memory[(cur + 1) % 2]);
        }
        return memory[cur];
    }
}
