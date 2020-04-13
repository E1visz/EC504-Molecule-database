# EC504-Molecule-database
# Final Project Implementation 
# Molecule_Database Description:
Our project aims to present a molecule database, which stores structural properties and elemental composition of molecules. The project will be finished with the ability to efficiently handle at least 10,000 molecules and the ability to efficiently search for a given molecule up to graph isomorphism. A user-friendly web-based command-line interface and an Android client will be established to support the above functions.

# Team 2
## Group Members:
* Chenhui Zhu (zhuch@bu.edu)
* Peixi Zhao (bradzhao@bu.edu)
* Suli Hu (sulihu@bu.edu )
* Jinyu Tian (jinyutn@bu.edu )
* Xushan Hu (huxushan@bu.edu)

## Basic Functionality 
### Overview

## Additional Feature Implementation:

### Download 1,000 known compounds from an existing database (e.g., [http://www.chemspider.com/AboutServices.aspx?][ChemSpider]]) into your molecular database.
PubChem is a freely available database of chemical structures of small organic molecules and information on their biological activities. We chose the PubChem API to we created the HttpURLConnection object to connect with URL as PubChem URL format. We pulled the data in a JSON format and used compound identifier(CID) as the input portion. The data is iterated through a for loop and increase ID by one each time until getting 1000 compounds.
![image] 

### Ability to search for the most similar molecule to a given molecule, under some reasonable graph similarity metric.
### Implement subgraph search - finding all molecules(Gs) that contain a subgraph(SG) provided
### The following additional features have been removed from our Midterm Status Report:
## References: 
[1] Givaudan Schweiz AG, 2013 Dec 11. Molecule database framework: a framework for creating database applications with chemical structure search capability. Journal of Cheminformatics.
Explanation: The involved scientists must be able to store this data and search it by chemical structure. We refer to the chemical structure of that model.

[2] Kun-Yi Hsin, Hugh P. Morgan, Steven R. Shave, Andrew C. Hinton, Paul Taylor, and Malcolm D. Walkinshaw*, 2010. EDULISS: a small-molecule database with data-mining and pharmacophore searching capabilities. Nucleic Acids Research.
Explanation: This article presents the relational database EDULISS (Edinburgh University Ligand Selection System), which stores structural, physicochemical and pharmacophoric properties of small molecules. We will reference the algorithms they use.

[3] Bc. Karol Kružel, 2008. Effective algorithms for searching for identical molecules and their application.
Explanation: Molecules are in computers usually represented in the form of molecular graphs. This work starts with the definition of all required terms and then the problem of graph isomorphism is briefly described. We refer to the backtracking method to search for our molecule.

[4] Sunghwan Kim, Jie Chen, Tiejun Cheng, Asta Gindulyte, Jia He, Siqian He, Qingliang Li, Benjamin A. Shoemaker, Paul A. Thiessen, Bo Yu, Leonid Zaslavsky, Jian Zhang and Evan E. Bolton. 2019. PubChem 2019 update: improved access to chemical data.
Explanation: PubChem is a key chemical information resource for the biomedical research community. It enables the function of Molecules name search and Isomers search, which is needed in our project. We will use PubChem to learn how to enable these functions.

[5] Alan Gibbons, Algorithmic Graph Theory. Cambridge University Press, 1985.
Explanation: As the requirement, molecules will be represented as an undirected multigraph without self-loops, whose vertices are labeled. In chemistry, a set of atoms combined with designated bonds are used to describe chemical molecules. Our project will store the chemical bonds of a module in a graph and store all of the graphs into a graph database. This reference is a textbook on graph theory, so we will use it to learn how to build the graph. database.

[6] Karam Gouda, Mosab Hassaan, A Fast Algorithm for Subgraph Search Problem.
Explanation:Explanation: After building the graph database abovementioned, we aim to finish a function with which users can do subgraph query: Users input a query graph, we will find the modules containing matching subgraph in our graph database and return them.

[7]https://getbootstrap.com/docs/4.4/getting-started/introduction/
Explanation: We decided to use the bootstrap framework to design UI. Here is a quick start on the website.
## Code:
All complete, working Java code used in our implementation. 
All data needed by our project to run (or a simple, publicly accessible link thereto).
All testing code utilized to observe the correctness of our code.
## Work Breakdown
* Suli Hu
	- Wrote command line interface. 
  - Implemented MolecularProperty() class.
	- Most similar search function: look for 4 cases to find the most similar molecule given an input molecule file
  - Designing the graph data structure implementing MoleculeGraph() class.
  - Implemented graphMatch() class.
* Peixi Zhao
  - Designing the graph data structure implementing MoleculeGraph() class.
  - Implemented graphMatch() class.
 	- Researched and implemented findSubgraph() Method.
  - Researched and implemented solution for Isomorphism problem, i.e same_graph class and all its methods 
  - Wrote Install.txt.
* Chenhui Zhu 
	- Wrote test cases for main and put in formatting for test cases
  - Built the data structure framework (layered HashMap)
	- Implemented add_Molecule() Method. 
	- Implemented find_Molecule() Method.
	- Wrote a bunch of Error catching constraints. 
* Jinyu Tian
	- Worked on setting up an Android-app to add and search for molecules and finishing these functions(not implemented in final program).
  - Assisted in designing data structure for the prototype.
  - Assisted in building the data structure framework.
  - Wrote Readme.md
* Xushan Hu
	- Worked on setting up a web-app to add and search for molecules (not implemented in final program), it can add multiple .txt files of molecule locally to database.
  - Finished downloading 1,0000 known compounds from an existing database (we used Pubchem) into our molecular database.
  - Wrote a bunch of Error catching constraints.
  - Wrote Readme.md
## Web App Interface
