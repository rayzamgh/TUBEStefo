#include "frontend.h"
#include <stdlib.h>
#include <ncurses.h>
#include <iostream>

using namespace std;

int main(){
	//Tampilan::GetInstance()->drawkotak(0, 0, 20, 20);
	//Tampilan::GetInstance()->drawkotak(21, 0, 10, 20);
	//Tampilan::GetInstance()->drawkotak(21, 21, 10, 10);
Tampilan::GetInstance()->drawtable(5, 5, 6, 2, 5, 5);
Tampilan::GetInstance()->drawtable(5, 5, 30, 10, 2, 1);
	
	//Tampilan::GetInstance()->drawtable(0, 6, 24, 5, 5, 5);
	//Tampilan::GetInstance()->drawtable(0, 12, 24, 5, 4, 5);
	Tampilan::GetInstance()->setCharTable('P', 5, 5, 6, 2, 2, 2);
	//Tampilan::GetInstance()->deletecharonpos(5,5);
	//Tampilan::GetInstance()->setcharonpos('L', 6,2);
	//char outp[] = "ACTUALREALLIFEPEPEGA";
	//Tampilan::GetInstance()->printstronpos(outp, 9, 10);
	//Tampilan::GetInstance()->updateLayar();
	getch();
	endwin();
	return(0);
}