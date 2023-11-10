package greedy;

public class _2383_minNumberOfHours {
    public static void main(String[] args) {
    }

    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int n = energy.length;
        int h = 0;

        for(int i = 0; i < n; ++i) {
            if(experience[i] >= initialExperience) {
                h += experience[i] - initialExperience + 1;
                initialExperience = experience[i]+1;
            }
            if(energy[i] >= initialEnergy) {
                h += energy[i] - initialEnergy + 1;
                initialEnergy = energy[i] + 1;
            }

            initialExperience += experience[i];
            initialEnergy -= energy[i];
        }

        return h;
    }
}
