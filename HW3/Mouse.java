class Mouse
{
	//印出地圖(完全理解)
	public static void matrixPrint(char m[][]) {
        for(char[]row:m)
		{
			for(char element:row)
				System.out.print(element);
				System.out.println();
		}
    }
	
	//不理解
	/*public static strset(String s,int i,char c) {
        return s.substring(0, i) + c + s.substring(i+1);
    }*/
	//路線搜尋(完全理解)
	public static boolean findPath(char m[][], int x, int y) {
		System.out.println("=========================");
		System.out.println("x=" +x+" y="+y);
		matrixPrint(m);
		if (x>=6||y>=8) return false;
		if (m[x][y] == '*') return false;
		if (m[x][y] == '+') return false;
		if (m[x][y] == ' ') m[x][y] = '.';
		if (m[x][y] == '.' && (x == 5 || y==7)) 
			return true;
		if (y<7&&m[x][y+1]==' ')//向右
			if (findPath(m, x,y+1)) return true;
		if(x<5&&m[x+1][y]==' ')//向下
			if (findPath(m, x+1,y)) return true;
		if(y>0&&m[x][y-1]==' ')//向左
			if (findPath(m, x,y-1)) return true;
		if(x>0&&m[x-1][y]==' ')//向上
			if (findPath(m, x-1,y)) return true;
		m[x][y]='.';
		return false; 
    }
	//地圖(完全理解)
	public static void main(String arges[])
    {
        char m[][]={
            {'*','*','*','*','*','*','*','*'},
            {'*','*',' ','*',' ','*','*','*'},
            {' ',' ',' ',' ',' ','*','*','*'},
            {'*',' ','*','*','*','*','*','*'},
            {'*',' ',' ',' ',' ',' ','*','*'},
            {'*','*','*','*','*',' ','*','*'}};
	findPath(m, 2, 0);
	System.out.println("=========================");
	matrixPrint(m);
        
    }
 
    
}
