package com.dam.theorigin.service;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import com.dam.theorigin.model.FileContentDetails;

@Service
public class MasterService {

	private static final String IMG_RESOURCE_DIR = "J:\\originserverdb\\images\\";
	private static final String VID_RESOURCE_DIR = "J:\\originserverdb\\";
	private static final String REPLICA_SERVER_1_DIR = "J:\\replicaserver1db\\";
	private static final String REPLICA_SERVER_2_DIR = "J:\\replicaserver2db\\";

	public String pushToReplica(FileContentDetails details) throws IOException {
		String sourcePath = VID_RESOURCE_DIR + details.getOriginFileName();
		File source = new File(sourcePath);
		File dest = new File(details.getReplicaServerPath());
		FileUtils.copyFileToDirectory(source, dest);
		return "success";
	}

}
