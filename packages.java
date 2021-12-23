package CIE;
import java.util.scanner;
public class student{
scanner scan=new scanner(system.in);
public string usn,name;
public int sem;
public void accept(){
system.out.println("enter usn:");
usn=scan.nextLine();
system.out.println("enter name:");
name=scan.nextLine();
system.out.println("enter sem:");
sem=scan.nextINT();
}
public void display()
{
system.out .println("Name:"+name);
syatem.out.println("USN:"+usn);
system.out.println("SEM:"+sem);
}
}
package CIE;
import java.util.scanner;
public class Internals extends CIE.student
{
scanner scan=new scanner(system.in);
public int ciem[]=new int[5];
public void accept()
{
for(int i=0;i<5;i++)
{
system.out.println("enter cie marks of subject"+(i+1));
ciem[i]=scan.nextINT();
}
}
}
packeg SEE;
import CIE.*;
import java.util.scanner;
public class extends cie.student
{
scanner scan=new scanner(system.in);
public int seem[]=new int[5];
public void accept()
{
for(int i=0;i<5;i++)
{
syatem.out.println("enter see marks of subject"+(i+1));
seem[i]=scan.nextINT();
}
}
}
import CIE.*;
import SEE.*;
import java.util.scanner;
class Total Marks
{
pblic static void main(string[] args)
{
int i,j,n;
scanner scan=new scanner(system.in);
int totle[]=new int[5];
system.out.println("enter the nuber of students:");
n=scan.nextINT();
CIE.Student s[]=new CIE.Stduent[n];
CIE.Internals ci[]=new CIE.Internals[n];
SEE.Externals se[]=new SEE.Externals[n];
for(i=0;i<n;i++)
{
system.out.println("Enter student"+(i+1)+" details-");
s[i]=new CIE.Student();
s[i].accept();
ci[i]=new CIE.Internals();
ci[i].accept();
se[i]=new SEE.Externals();
se[i].accept();
}
for(i=0;i<n;i++)
{
system.out.println("Details of student"(i+1));
s[i].display();
for(j=0;j<5;j++)
{
total[j]=ci[i].ciem[j]+se[i].seem[j];
system.out.println("Total marks in subject"+(j+1)+":"+total[j]);
}
system.out.println();
}
}

