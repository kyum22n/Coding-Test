class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        // 좌표
        int x = 0;
        int y = 0;
        
        // 배열에 들어갈 정수
        int num = 1;
        
        // 현재 방향
        int dir = 0;
        
        // 방향별 이동 정보(오른쪽, 아래, 왼쪽, 위)
        int xdir[] = {0, 1, 0, -1};
        int ydir[] = {1, 0, -1, 0};
        
        while (num <= n*n) {
            answer[x][y] = num;
            num++;
            
            // 다음 위치
            int nextX = x + xdir[dir];
            int nextY = y + ydir[dir];
            
            // 방향 전환
            if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= n || answer[nextX][nextY] != 0) {
                dir = (dir + 1) % 4;
            }
            
            // 전환한 방향으로 이동
            x += xdir[dir];
            y += ydir[dir];
        }
        
        return answer;
    }
}