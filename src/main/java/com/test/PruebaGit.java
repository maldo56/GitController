package com.test;

import java.io.IOException;

import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoFilepatternException;

import com.git.GitControl;

public class PruebaGit {

	public static void main(String[] args) throws NoFilepatternException, IOException, GitAPIException {
		// TODO Auto-generated method stub
		
//		String localPath = "/home/maldo56/Documents/PruebaClone";
//      String remotePath = "https://github.com/maldo56/Prototipo.git";
		
		String localPath = "/home/maldo56/Documents/GitControl";
		String remotePath = "https://github.com/maldo56/GitController.git";
		
		
        GitControl gc = new GitControl(localPath, remotePath);
        
        
//        gc.initRepo();
        
//        Clone repository
        gc.cloneRepo();
        
//        Add files to repository
        gc.addToRepo();
        
//        //Commit with a custom message
        gc.commitToRepo("Commit con prueba de git 2");
        
//        //Push commits
        gc.pushToRepo();
//        
//        //Pull
//        gc.pullFromRepo();
        
	}

}
