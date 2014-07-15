/* 
 * File:   _readfile_.hpp
 * Author: Mohan
 *
 * Created on July 8, 2014, 8:05 PM
 * 
 * Custom header file to read and parse text file for 3-D points...
 */

#ifndef _READFILE__HPP
#define	_READFILE__HPP

#include <iostream>
#include <stdlib.h>
#include <fstream>
#include <sstream>

class readfile{

private : 
     std::ifstream txt_file;
     std::string curline; //current line...
    
public:
  
    readfile(std::string filename); //checks file...
     std::string readtext(); //reading and returning the line into string 
    ~readfile(); //closing the file in destructor
};

readfile::readfile(std::string filename){

    
    txt_file.open(filename.c_str());
    //check if file open, otherwise not open then exit...
    if(!txt_file.is_open()){
    perror(("Error while opening file " + filename.c_str()));
        exit(1);
    }
}

std::string readfile::readtext(std::string filename){

    std::string line;
	  if(getline(txt_file,line)) {
		  return line;
	  } 
   else {
	   std::cout<<"End Of FILE";
	   return "EOF";
   }
}

    readfile::~readfile(){
    
        txt_file.close();
    }


#endif	/* _READFILE__HPP */

