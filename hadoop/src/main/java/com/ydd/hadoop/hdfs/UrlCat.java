package com.ydd.hadoop.hdfs;

import java.net.URL;

import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;

public class UrlCat {
static {
	URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
	
	
}
}
