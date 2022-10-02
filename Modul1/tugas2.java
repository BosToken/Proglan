import java
                                                                                                                                                .
util                                                                                                                                            .
Scanner                                                                                                                                         ;

public class tugas2                                                                                                                             {
    
    public static void main
                                                                                                                                                (
        String                                                                                                                                  [] 
        args
                                                                                                                                                )
                                                                                                                                                {
        Scanner input                                                                                                                           = 
        new Scanner
                                                                                                                                                (
        System                                                                                                                                  .
        in
                                                                                                                                                );
        Boolean isLengthMatch                                                                                                                   , 
        isFormatMatch                                                                                                                           ;
        String message                                                                                                                          ;
        do                                                                                                                                      {
            System.out.print
                                                                                                                                                (
            "Masukan Kode : "
                                                                                                                                                );
            String code                                                                                                                         = 
            input                                                                                                                               .
            next                                                                                                                                ();
            isLengthMatch                                                                                                                       = 
                                                                                                                                                (
            code                                                                                                                                .
            length
                                                                                                                                                ()
                                                                                                                                                == 
            15
                                                                                                                                                ) 
                                                                                                                                                ? 
            true                                                                                                                                : 
            false                                                                                                                               ;
            message                                                                                                                             = 
            isLengthMatch                                                                                                                       ? 
            "Berhasil"                                                                                                                          : 
            "Harus Memasukan NIM Sepanjang 15 Character"                                                                                        ;
            isFormatMatch                                                                                                                       = 
                                                                                                                                                (
            code                                                                                                                                .
            indexOf
                                                                                                                                                (
            "10370311"
                                                                                                                                                ) 
                                                                                                                                                == 
            4
                                                                                                                                                ) 
                                                                                                                                                ? 
            true                                                                                                                                : 
            false                                                                                                                               ;  
            message                                                                                                                             = 
            isFormatMatch                                                                                                                       ? 
            "Berhasil"                                                                                                                          : 
            "Harus Menggunakan Format '10370311'"                                                                                               ;
            System.out.println                                                                                                                  (
            message
                                                                                                                                                );
                                                                                                                                                }
        while
                                                                                                                                                (
                                                                                                                                                !
            isLengthMatch 
                                                                                                                                                && 
                                                                                                                                                !
            isFormatMatch
                                                                                                                                                );
        input                                                                                                                                   .
        close                                                                                                                             ();
                                                                                                                                                }
                                                                                                                                                }
