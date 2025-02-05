<h1 align="center">Texera - Collaborative Data Analytics Using Workflows.</h1>

<p align="center">
  <img src="core/new-gui/src/assets/logos/full_logo_small.png" alt="texera-logo" width="192px" height="109px"/>
  <br>
  <i>Texera supports scalable computation and enables advanced AI/ML techniques.</i>
  <br>
  <i>"Collaboration" is a key focus, and we enable an experience similar to Google Docs, but for data analytics. </i>
  <br>
  
  <h4 align="center">
    <a href="https://youtu.be/2gfPUZNsoBs">Demo Video</a>
    |
    <a href="https://texera.github.io/blog/">Blogs</a>
    |
    <a href="https://github.com/Texera/texera/wiki/Getting-Started">Getting Started</a>
    <br>
  </h4>
  
</p>
</p>

<!---
(Orignal intro paragraph, commented out)
## Texera

Texera is a system to support collaborative, ML-centric data analytics as a cloud-based service using GUI-based workflows. It supports scalable computation with a parallel backend engine, and enables advanced AI/ML techniques. "Collaboration" is a key focus, and we want to enable an experience similar to existing services such as Google Docs, but for data analytics, especially for people with different backgrounds, including IT developers and domain scientists with limited programming background.
-->

## Motivation

* Many data analysts need to spend a significant amount of effort on low-level computation to do data wrangling and preparation, and want to use latest AI/ML techniques. These tasks are especially tough for non-IT users. 

* Many workflow-based analysis systems are not parallel, making them not capable of dealing with big data sets. 

* Cloud-based services and technologies have emerged and advanced significantly in the past decade. Emerging browser-based techniques make it possible to develop powerful browser-based interfaces, which also benefit from high-speed networks.

* Existing big data systems support little interaction during the execution of a long running job, making them hard to manage once they are started.

## Goals

* Provide data analytics as cloud services;
* Provide a browser-based GUI to form a workflow without writing code;
* Allow non-IT people to do data analytics;
* Support collaborative data analytics;
* Allow users to interact with the execution of a job;
* Support huge volumes of data efficiently.

## Sample Workflow

The following is a workflow formulated using the Texera GUI in a Web browser, which consists of operators such as regex search, sentiment analysis, user-defined function (UDF) in Python, and visualization.

![Sample Texera Workflow](https://user-images.githubusercontent.com/12926365/171459157-1792971d-a31f-49e7-ab98-6f3b9ead9f5b.png)

## Publications (Computer Science):

* (4/2017) A Demonstration of TextDB: Declarative and Scalable Text Analytics on Large Data Sets, Zuozhi Wang, Flavio Bayer, Seungjin Lee, Kishore Narendran, Xuxi Pan, Qing Tang, Jimmy Wang, Chen Li, [ICDE 2017](http://icde2017.sdsc.edu/), **Best Demo award**, [PDF](https://chenli.ics.uci.edu/files/icde2017-textdb-demo.pdf), [Video](https://github.com/Texera/texera/wiki/Video).
* (1/2020) Amber: A Debuggable Dataflow system based on the Actor Model, Avinash Kumar, Zuozhi Wang, Shengquan Ni, Chen Li, VLDB 2020 [PDF](http://www.vldb.org/pvldb/vol13/p740-kumar.pdf), [Video](https://www.youtube.com/watch?v=T5ShFRfHmgI), [Slides](https://docs.google.com/presentation/d/1v8G9lDmfv4Ff2YWyrGfo_9iMQVF4N8a-4gO4H-K6rCk/edit?usp=sharing)
* (7/2020) Demonstration of Interactive Runtime Debugging of
Distributed Dataflows in Texera, Zuozhi Wang, Avinash Kumar, Shengquan Ni, Chen Li, VLDB 2020 [PDF](http://www.vldb.org/pvldb/vol13/p2953-wang.pdf), [Video](https://www.youtube.com/watch?v=SP-XiDADbw0), [Slides](https://docs.google.com/presentation/d/14U6RPZfeb8Ho0aO2HsCSc8lRs6ul6AxEIm5gpjeVUYA/edit?usp=sharing)
* (4/2022) Optimizing Machine Learning Inference Queries with Correlative Proxy Models, Zhihui Yang, Zuozhi Wang, Yicong Huang, Yao Lu, Chen Li, X. Sean Wang, VLDB 2022 [PDF](https://www.vldb.org/pvldb/vol15/p2032-yang.pdf).
* (6/2022) Demonstration of Collaborative and Interactive Workflow-Based Data Analytics in Texera, Xiaozhen Liu, Zuozhi Wang, Shengquan Ni, Sadeem Alsudais, Yicong Huang, Avinash Kumar, Chen Li, in VLDB 2022 [PDF](https://www.vldb.org/pvldb/vol15/p3738-liu.pdf), [Demo Video](https://youtu.be/2gfPUZNsoBs).
* (6/2022) Demonstration of Accelerating Machine Learning Inference Queries with Correlative Proxy Models, Zhihui Yang, Yicong Huang, Zuozhi Wang, Feng Gao, Yao Lu, Chen Li, X. Sean Wang, in VLDB 2022 [PDF](https://www.vldb.org/pvldb/vol15/p3734-yang.pdf) .
* (7/2022) Drove: Tracking Execution Results of Workflows on Large Datasets, Sadeem Alsudais, in the PhD workshop at VLDB 2022 [PDF](http://ceur-ws.org/Vol-3186/paper_10.pdf).
* (9/2022) Fries: Fast and Consistent Runtime Reconfiguration in Dataflow Systems with Transactional Guarantees, Zuozhi Wang, Shengquan Ni, Avinash Kumar, Chen Li, VLDB 2023 [PDF](https://www.vldb.org/pvldb/vol16/p256-wang.pdf). 
* (12/2022) Towards Interactive, Adaptive and Result-aware Big Data Analytics, Avinash Kumar, Phd Thesis [PDF](https://arxiv.org/abs/2212.07096). 

## Publications (Interdisciplinary):

* (4/2021) Why Do People Oppose Mask Wearing? A Comprehensive Analysis of US Tweets During the COVID-19 Pandemic, Lu He, Changyang He, Tera Leigh Reynolds, Qiushi Bai, Yicong Huang, Chen Li, Kai Zheng, and Yunan Chen in JAMIA 2021 [PDF](https://www.ncbi.nlm.nih.gov/pmc/articles/PMC7989302/pdf/ocab047.pdf).
* (9/2021) The Social Amplification and Attenuation of COVID-19 Risk Perception Shaping Mask Wearing Behavior: A Longitudinal Twitter Analysis, Suellen Hopfer, Emilia J. Fields, Yuwen Lu, Ganesh Ramakrishnan, Ted Grover, Quishi Bai, Yicong Huang, Chen Li, and Gloria Mark in PLOS ONE, 2021 [PDF](https://journals.plos.org/plosone/article?id=10.1371/journal.pone.0257428).

## Videos

* [Texera demo in VLDB 2020](https://www.youtube.com/watch?v=SP-XiDADbw0)
* [Amber engine presentation in VLDB 2020](https://www.youtube.com/watch?v=T5ShFRfHmgI)
* See [Texera in action](https://www.youtube.com/watch?v=NXfynBUwdVg). 

## Getting Started

* For users, visit [Guide to Use Texera](https://github.com/Texera/texera/wiki/Getting-Started).
* For developers, visit [Guide to Develop Texera](https://github.com/Texera/texera/wiki/Guide-for-Developers).

Texera was formally known as "TextDB" before August 28, 2017.

## Instructions for VLDB 2022 Demo Paper

To try our collaborative data analytics in _Demonstration of Collaborative and Interactive Workflow-Based Data Analytics in Texera_, visit [https://github.com/Texera/texera/wiki/Instructions-for-VLDB-2022-Demo](https://github.com/Texera/texera/wiki/Instructions-for-VLDB-2022-Demo).

## Acknowledgements

This project is supported by the <a href="http://www.nsf.gov">National Science Foundation</a> under the awards [III 1745673](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1745673), [III 2107150](https://www.nsf.gov/awardsearch/showAward?AWD_ID=2107150), AWS Research Credits, and Google Cloud Platform Education Programs.

* <a href="http://www.yourkit.com"><img src="https://www.yourkit.com/images/yklogo.png" alt="Yourkit" height="30"/></a>  [Yourkit](https://www.yourkit.com/) has given an open source license to use their profiler in this project. 
