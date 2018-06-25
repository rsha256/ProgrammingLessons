// @author Rahul Shah
// Must be run in powershell

var fso = new ActiveXObject("Scripting.FileSystemObject");
var docPath = WScript.Arguments(0);
docPath = fso.GetAbsolutePathName(docPath);

var pdfPath = docPath.replace(/\.doc[^.]*$/, ".pdf");
// regex allows all .doc(x) to be recognized and thus converted to pdf
var objWord = null;

try
{
    WScript.Echo("Saving '" + docPath + "' as '" + pdfPath + "'...");
    // user-friendly echo-ing

    objWord = new ActiveXObject("Word.Application");
    objWord.Visible = false;

    var objDoc = objWord.Documents.Open(docPath);

    var wdFormatPdf = 17;
    objDoc.SaveAs(pdfPath, wdFormatPdf);
    objDoc.Close();

    WScript.Echo("Done.");
}
finally
{
    if (objWord != null)
    {
        objWord.Quit();
    }
}
