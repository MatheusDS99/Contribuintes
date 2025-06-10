package Contribuintes;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Controle {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        ArrayList<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.print("Quantos contribuintes deseja digitar? ");
        int n =input.nextInt();
        input.nextLine();

        for (int i = 0;i<n;i++){
            TaxPayer taxPayer = new TaxPayer();
            System.out.printf("Digite os dados do %dº contribuinte: %n", i+1);
            System.out.print("Renda anual com salário: ");
            double salary = input.nextDouble();
            System.out.print("Renda anual com prestação de serviços: ");
            double services = input.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capital = input.nextDouble();
            System.out.print("Gastos médicos: ");
            double healthy = input.nextDouble();
            System.out.print("Gastos educacionais: ");
            double education = input.nextDouble();
            input.nextLine();
            taxPayer.setSalaryIncome(salary);
            taxPayer.setServicesIncome(services);
            taxPayer.setCapitalIncome(capital);
            taxPayer.setHealthSpending(healthy);
            taxPayer.setEducationSpending(education);
            taxPayerList.add(taxPayer);
        }

        for (int i = 0; i<n;i++){
            System.out.printf("Resumo do %dº contribuinte: %n", i+1);
            System.out.printf("Imposto bruto total: %.2f%n", taxPayerList.get(i).grossTax());
            System.out.printf("Abatimento: %.2f%n", taxPayerList.get(i).taxRebate());
            System.out.printf("Imposto devido: %.2f%n", taxPayerList.get(i).netTax());
            System.out.println();
        }


    }
}
