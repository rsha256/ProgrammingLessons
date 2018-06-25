##########
#
# This is a common shell script used to convert .doc or .docx to .pdf's
#
# NOTE: This must be run in Powershell
#
# @author cxw - https://superuser.com/users/269989/cxw - CC-BY-SA 3.0
# @author Umar Farooq Khawaja
# @author Rahul Shah
#
##########

# To convert all .docx to .pdfs

# ls *.docx | %{cscript //nologo C:\Users\rahul\ProgrammingLessons\resources\SaveAsPDF.js $_}

$Word=New-Object -ComObject Word.Application

$Files=@(Get-ChildItem ".\*.docx") + @(Get-ChildItem ".\*.doc")
    # Need @() to get an array in case there is only one file - see
    # https://blogs.technet.microsoft.com/heyscriptingguy/2013/07/18/powertip-find-number-elements-in-a-powershell-array/#comment-104863

for($file_idx = 0; $file_idx -lt $Files.Count; ++$file_idx) {

    # Show the current progress
    $File = $Files[$file_idx]
    Write-Progress -Activity "Convert DOC(X) to PDF" `
                    -CurrentOperation $File.Name `
                    -PercentComplete (($file_idx/$Files.Count)*100)

    # Make the PDF
    $Document=$Word.Documents.Open($File.FullName)
    $Name=($Document.FullName -replace "\.docx?", ".pdf")
    # -replace is case-insensitive regex per:
    # https://ss64.com/ps/syntax-regex.html

    $Document.SaveAs([ref] $Name, [ref] 17)
    $Document.Close()
}

# Clean up
$Word.Quit()
# Doesn't close other Word instance that may be running.

# Remove any dangling references, per https://technet.microsoft.com/en-us/library/ff730962.aspx
[System.Runtime.Interopservices.Marshal]::ReleaseComObject($Word)
Remove-Variable Word

# By cxw - https://superuser.com/users/269989/cxw - CC-BY-SA 3.0
# Modified from https://superuser.com/a/1187598/269989 by https://superuser.com/users/12797/umar-farooq-khawaja
# Modified by Rahul Shah
