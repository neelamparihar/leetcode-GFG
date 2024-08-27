class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
         // create adjacency list
        List<double[]>[] adjList = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            adjList[edges[i][0]].add(new double[] {edges[i][1],succProb[i]});
            adjList[edges[i][1]].add(new double[] {edges[i][0],succProb[i]});
        }
        // adjacency list created



        // probability to reach any node : store in prob array at corresponding position
        double[] prob = new double[n];
        prob[start] = 1.0;  // start to start prabability = 1.0

        // for not coming to already visited number mark that visited
        boolean[] vis = new boolean[n];



        // simple priorityQueue
        Queue <double[]> queue = new PriorityQueue<>(Collections.reverseOrder((a, b) -> Double.compare(a[1],b[1])));
        queue.add(new double[]{start,1.0});


        while (!queue.isEmpty()){
            double[] cur = queue.poll();
            int curNode = (int) cur[0];
            if(curNode == end) return cur[1];  // if we reach at end node/number return pcorreponding probability
            if(vis[curNode] == true) continue; // if already visited node skip it.
            vis[curNode] = true; // if not visited before then mark it as  visited

            double curProb = cur[1];


            for (double[] g : adjList[curNode]) {
                int nxt = (int)g[0];
                double p = g[1];
                double val = prob[nxt];
                if(curProb*p > prob[nxt]){  // if you are getting more value for corresponding position in prob array update that and add new pair in that
                    queue.add(new double[]{nxt,curProb*p});
                }
            }

        }

        // If there is no path from start to end, return 0
        return 0.0;
    }

}