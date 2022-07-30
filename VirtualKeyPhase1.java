package virtualkey;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class VirtualKeyPhase1
{
    public static void main(String[] args) 
    {
        File desfolder = new File("D:\\GitHub\\Virtual Key For Repository");
        desfolder.mkdirs(); 
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("Prototypes of the Application Page>\n");
            System.out.println("These are the functions: \n");
            System.out.println("1. To display the files in ascending order\n");
            System.out.println("2. Here are some Business level operation menu \n");
            System.out.println("3. Exit from the application");
            System.out.println("Which function you want to proceed : \n");
            int options = scan.nextInt();
            switch(options)
            {
                case 1:

                    File arr[] = desfolder.listFiles();
                    Arrays.sort(arr);
                    for(int i=0;i<arr.length;i++)
                        System.out.println(arr[i]);
                        break;

                case 2:
                    Boolean tempor = true;
                    while(tempor) 
                    {
                        System.out.println("Option 1 :- Select option 1 - To Add a file in the existing directory");
                        System.out.println("Option 2 :- Select option 2 - To Delete a file from the existing directory. ");
                        System.out.println("Option 3 :- Select option 3 - To Search a user specified file from the directory");
                        System.out.println("Option 4 :- Select option 4 - Back to the previous menu");
                        System.out.println("Option 5 :- Select option 5 - Application Exit Successfully");

                        int choice2 = scan.nextInt();

                        switch (choice2) {
                        case 1:
                        	System.out.println("Enter a File Name to create");
        					String s1 = scan.next();
        					File file = new File(desfolder, s1);

        					try {
        						Boolean value = file.createNewFile();
        						if (value) 
        						{
        							System.out.println("The new file is created.");
        						} else 
        						{
        							System.out.println("The file already exists.");
        						}
        					} 
        					catch (Exception e) 
        					{
        						e.getStackTrace();
        					}

                              break;
             
                            case 2:
                            	System.out.println("Enter the File Name to Delete");
            					String name = scan.next();
            					File file1 = new File(desfolder, name);

            					try {
            						boolean value = file1.delete();
            						if (value) {
            							System.out.println("File deleted Successfully.");
            						} else {
            							System.out.println("File Not Found");
            						}
            					} 
            					catch (Exception e) 
            					{
            						e.getStackTrace();
            					}
            					break;

                            case 3:
                            	System.out.println("Enter a key name to search");
            					String search = scan.next();
            					boolean flag1 = false;
            					File arr1[] = desfolder.listFiles();
            					System.out.println("File Found :\n");
            					for (int i = 0; i < arr1.length; i++) {
            						if (arr1[i].getName().startsWith(search)) {
            							flag1 = true;
            							System.out.println(arr1[i]);
            						}
            					}
            					if (flag1 == false) {
            						System.out.println("No file found");
            					}
                            case 4:
                                tempor = false;
                                break;

                            case 5:
                                System.out.println("Application Exited Succesfully");
                                System.exit(0);
                            default:
                                System.out.println("Enter correct name and retry");

                        }

                    }
                    break;

                case 3:
                    System.out.println("Application Exited Successfully");
                    System.exit(0);

                default:
                    System.out.println("Input correct value and retry");
                    break;

            }
            
            }
        
    }
}
