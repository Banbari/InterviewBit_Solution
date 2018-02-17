public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        List<java.awt.Point> events = new ArrayList<>();
        for (int i = 0; i < arrive.size(); i++) {
            events.add(new java.awt.Point(arrive.get(i), 1));
            events.add(new java.awt.Point(depart.get(i), 0));
        }
        Collections.sort(events, new Comparator<java.awt.Point>() {
            @Override
            public int compare(java.awt.Point p1, java.awt.Point p2) {
                if (p1.x != p2.x) {
                    return p1.x - p2.x;
                } else {
                    // happen in the same day, let depart event happen first
                    return p1.y - p2.y;
                }
            }
        });
        int activeUsers = 0;
        for (java.awt.Point point : events) {
            if (point.y == 1) {
                // one more arrive 
                activeUsers++;
                if (activeUsers > K) {
                    return false;
                }
            } else if(point.y == 0){
                // one customer leaves
                activeUsers--;
            }
        }
        return true;
    }
    
}