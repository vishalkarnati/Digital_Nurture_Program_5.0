-- Write a PL/SQL block that fetches all loans due in the next 30 days and prints a reminder message for each customer.

SET SERVEROUTPUT ON;

BEGIN
    FOR loan IN (
        SELECT LoanID,
               CustomerID,
               EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )

    LOOP
        DBMS_OUTPUT.PUT_LINE( 'Reminder: Customer' || loan.CustomerID || 'Loan' || loan.LoanID || 'is due on' || loan.EndDate );
    END LOOP;

END;
/