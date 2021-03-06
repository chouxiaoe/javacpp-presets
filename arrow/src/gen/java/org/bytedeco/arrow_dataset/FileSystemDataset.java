// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief A Dataset of FileFragments. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class FileSystemDataset extends Dataset {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileSystemDataset(Pointer p) { super(p); }

  /** \brief Create a FileSystemDataset.
   * 
   *  @param schema [in] the top-level schema of the DataDataset
   *  @param root_partition [in] the top-level partition of the DataDataset
   *  @param format [in] file format to create fragments from.
   *  @param filesystem [in] the filesystem which files are from.
   *  @param infos [in] a list of files/directories to consume.
   *  attach additional partition expressions to FileInfo found in {@code infos}.
   * 
   *  The caller is not required to provide a complete coverage of nodes and
   *  partitions. */
  
  ///
  ///
  public static native @ByVal FileSystemDatasetResult Make(
        @SharedPtr @ByVal Schema schema, @SharedPtr @ByVal Expression root_partition,
        @SharedPtr FileFormat format, @SharedPtr FileSystem filesystem,
        @StdVector FileInfo infos);

  /** \brief Create a FileSystemDataset with file-level partitions.
   * 
   *  @param schema [in] the top-level schema of the DataDataset
   *  @param root_partition [in] the top-level partition of the DataDataset
   *  @param format [in] file format to create fragments from.
   *  @param filesystem [in] the filesystem which files are from.
   *  @param infos [in] a list of files/directories to consume.
   *  @param partitions [in] partition information associated with {@code infos}.
   *  attach additional partition expressions to FileInfo found in {@code infos}.
   * 
   *  The caller is not required to provide a complete coverage of nodes and
   *  partitions. */
  
  ///
  ///
  public static native @ByVal FileSystemDatasetResult Make(
        @SharedPtr @ByVal Schema schema, @SharedPtr @ByVal Expression root_partition,
        @SharedPtr FileFormat format, @SharedPtr FileSystem filesystem,
        @StdVector FileInfo infos, @ByVal ExpressionVector partitions);

  /** \brief Create a FileSystemDataset with file-level partitions.
   * 
   *  @param schema [in] the top-level schema of the DataDataset
   *  @param root_partition [in] the top-level partition of the DataDataset
   *  @param format [in] file format to create fragments from.
   *  @param filesystem [in] the filesystem which files are from.
   *  @param forest [in] a PathForest of files/directories to consume.
   *  @param partitions [in] partition information associated with {@code forest}.
   *  attach additional partition expressions to FileInfo found in {@code forest}.
   * 
   *  The caller is not required to provide a complete coverage of nodes and
   *  partitions. */
  
  ///
  public static native @ByVal FileSystemDatasetResult Make(
        @SharedPtr @ByVal Schema schema, @SharedPtr @ByVal Expression root_partition,
        @SharedPtr FileFormat format, @SharedPtr FileSystem filesystem,
        @ByVal PathForest forest, @ByVal ExpressionVector partitions);

  /** \brief Write to a new format and filesystem location, preserving partitioning.
   * 
   *  @param plan [in] the WritePlan to execute.
   *  @param scan_context [in] context in which to scan fragments before writing. */
  public static native @ByVal FileSystemDatasetResult Write(
        @Const @ByRef WritePlan plan, @SharedPtr ScanContext scan_context);

  public native @StdString String type_name();

  public native @ByVal DatasetResult ReplaceSchema(
        @SharedPtr @ByVal Schema schema);

  public native @SharedPtr FileFormat format();

  public native @ByVal StringVector files();

  public native @Const @ByRef ExpressionVector partitions();

  public native @StdString String ToString();
}
