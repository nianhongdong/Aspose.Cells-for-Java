package AsposeCellsExamples.Slicers;

import AsposeCellsExamples.Utils;
import com.aspose.cells.*;

public class ChangeSlicerProperties {
	
	static String sourceDir = Utils.Get_SourceDirectory();
	static String outputDir = Utils.Get_OutputDirectory();

	public static void main(String[] args) throws Exception {
		System.out.println("Aspose.Cells for Java Version: " + CellsHelper.getVersion());
		// ExStart:1
		// Load sample Excel file containing a table.
		Workbook workbook = new Workbook(sourceDir + "sampleCreateSlicerToExcelTable.xlsx");

		// Access first worksheet.
		Worksheet worksheet = workbook.getWorksheets().get(0);

		// Access first table inside the worksheet.
		ListObject table = worksheet.getListObjects().get(0);

		// Add slicer
		int idx = worksheet.getSlicers().add(table, 0, "H5");

		Slicer slicer = worksheet.getSlicers().get(idx);
		slicer.setPlacement(PlacementType.FREE_FLOATING);
		slicer.setRowHeightPixel(50);
		slicer.setWidthPixel(500);
		slicer.setTitle("Aspose");
		slicer.setAlternativeText("Alternate Text");
		slicer.setPrintable(false);
		slicer.setLocked(false);

		// Refresh the slicer.
		slicer.refresh();

		// Save the workbook in output XLSX format.
		workbook.save(outputDir + "outputChangeSlicerProperties.xlsx", SaveFormat.XLSX);
		// ExEnd:1

		// Print the message
		System.out.println("ChangeSlicerProperties executed successfully.");
	}
}
