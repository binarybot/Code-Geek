/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classifier;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48; 
import weka.core.Debug.Random;

import weka.core.Instances;
import weka.core.converters.JSONLoader;


/**
 *
 * @author Mohan
 */
public class Classifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        // TODO code application logic here
        File bread = (new File("C:\\Users\\Mohan\\Music\\Data\\vo.json"));
     //   JSONParser parser = new JSONParser();
        
      JSONLoader c = new JSONLoader(); 
 c.setSource(bread);
  System.out.println("DataSet" + c.getDataSet());  
  
  Instances vote = c.getDataSet();
  
  vote.setClassIndex(vote.numAttributes()-1);
  
  J48 j = new J48();
  j.buildClassifier(vote);
  
  Evaluation ev = new Evaluation(vote);
  ev.crossValidateModel(j, vote, 5,new Random(1), (Object[]) args);
  System.out.println(ev.toSummaryString("result",true));
  //System.out.println(ev.precision(2) + ev.recall(2));

       BufferedReader breader = null;
       breader =new BufferedReader(new FileReader("C:\\Users\\Mohan\\Documents\\stable-3-6\\data\\iris.arff"));
       
Instances train = new Instances(breader);
train.setClassIndex(train.numAttributes()-1);

breader.close();

J48 J = new J48();
J.buildClassifier(train);

Evaluation eval = new Evaluation(train);
eval.crossValidateModel(J, train, 10, new Random(1), (Object[]) args);
System.out.println(eval.toSummaryString("Result Set", true));
System.out.println(eval.fMeasure(2)+ " fm" + "coeff"+eval.precision(2)+ "cong" + eval.confusionMatrix());
       
    }
}
