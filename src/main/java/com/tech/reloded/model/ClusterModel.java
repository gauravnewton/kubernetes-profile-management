/*
 * Copyright gauravnewton
 * 13-12-2024 at 0:53 IST
 */

package com.tech.reloded.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The type Cluster model.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClusterModel {
    @Schema(example = "VVSG5kbktsamRVCkZ6ajl1SzdlNDlTamFINjFwYnJPUUcyUGk4MU92UTFvPQ0V3L1gxY2g4NGU4a0RPcUpFbHN4TCs2ZHZIdW1weEp6SEI3VlBMR0IKYXNwZDJPd0lQWjdzVnNtVW9PUitTS096Y3UxbEZEM2hKbkNHVVY3VnFQeWxsUFJTK1BLcFNnSDdDNE42UENHUQpxRE1GV2Y0V2F0REtML09ZdExwZWNQa2pUWTZhb0EzR1dKRnZGaDJ0VzlSVHBGSWNEMDRmWERLM3RKdkViOURSeGlJQVdiR3lYYb3BmCmdCaFNsZDhUWUdWaVFLMGYwWU1jS0dhd2VpQlhxYit5Wlh3RGJRTjQ5a2dnOUFBUlkwRzhCWjg5OStuakRzQm0KSUZiL241WXYvWSs1Ci0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0KLS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSURCVENDQWUyZ0F3SUJBZ0lJQWJLQ3pwY3NWTkF3Rk84ejdtdFcxRUEKWUVFK3NrbGV5Qm5TclBsVWVlNDJIMSszTHBIa2oyMUxuVE5uem5zSXY4R0RqOWFQOU5hODhXRnd2bWlNZGtJRgp2Wi9XMDUvVjBkMU1iWkNaS1hhMGtEM2ZTRTJoQWdNQkFBR2pXVEJYTUE0R0ExVWREd0VCL3dRRUF3SUNwREFQCkJnTlZIUk1CQWY4RUJUQURBUUgvTUIwR0ExVWREZ1FXQkJUamtuSEIyV1Z4SWJ2WWJLNkdEbnkzemhCL0h6QVYKQmdOVkhSRUVEakFNZ2dwcmRXSmxjbTVsZEdWek1BMEdDU3FHU0liM0RRRUJDd1VBQTRJQkFRQ2NnVVJka3pPOApxTDhLbSt4QVVqNnBiSitvbnlPVnplNVBBMlNSQ3FTVGxJUzlJc0dWZENoOGNBY3NuMk1TZ1V3VllMMHNXQjBDCkI3eTk4L3FoZWdGcWFzFFZSktvWklodmNOQVFFTEJRQXdGVEVUTUJFR0ExVUUKQXhNS2EzVmlaWEp1WlhSbGN6QWVGdzB5TkRFd01qRXhNREkzTlRkYUZ3MHpOREV3TVRreE1ETXlOVGRhTUJVeApFekFSQmdOVkJBTVRDbXQxWW1WeWJtVjBaWE13Z2dFaU1BMEdDU3FHU0liM0RRRUJBUVVBQTRJQkR3QXdnZ0VLCkFvSUJBUUMxb29BWkZDSUVXT2d4WGMrTS9zZ3FDTXRmSldBRTJQdkJjbHNkR3FDL2paazhlRlRSckppTXFZLysKUzl0K0labnZYeDAxTjNVVXViMWxYWjhUN1VWMEprTzBoVXlKcWEybGQ4Z1g5VzVhd1B2UVRFeUsxdTV4TFJOcQo2UFFqWVlhNTBpWmNaTGR4dHBQb2ZvYUFMSFVzdzNaRXNyU1Z6VzN2V3ZMK0R6cWRkaHh3Q1jJzUVFRMm1jSOXV1bmYxK0J")
    @JsonProperty("certificate-authority-data")
    private String certificateAuthorityData;
    @Schema(example = "https://8FDE7667FB3DA3D76DA58D4B651EF537.gr2.eu-west-3.eks.amazonaws.com")
    private String server;
    @Schema(example = "arn:aws:eks:eu-west-3:335425316266:cluster/abcd-eks-cluster")
    private String name;
}
