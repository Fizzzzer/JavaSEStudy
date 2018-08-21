## Java基础知识拾遗--IO篇

#### **Properties**

Properties是HashTable的子类，也就是说他具备map集合的特点，而且他里面是以键值对的形式进行存储的，且键值对都是字符串。是集合和IO技术相结合的集合容器

该对象的特点是可以用于键值对的形式的配置文件

接下来看看Properties类的几个常用API

    void list(PrintStream out) 将属性列表输出到指定的输出流。 
    
    void list(PrintWriter out) 将属性列表输出到指定的输出流。
    
    void load(InputStream inStream) 从输入流中读取属性列表（键和元素对）。
    
    void load(Reader reader) 按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）
    
    String	getProperty(String key)  用指定的键在此属性列表中搜索属性。
    

    
    String	getProperty(String key, String defaultValue) 用指定的键在属性列表中搜索属性
    
    Object	setProperty(String key, String value) 调用 Hashtable 的方法 put。
    
以上就是Properties的几个常用方法,做一个简单的说明，这里就不做详细的Demo演示了


### **ObjectInoutStream 和 ObjectOutputStream**

这是操作对象的流对象，可以将对象以文件的形式进行保存，实现对象的持久化存储，被保存的对象需要实现Serializable接口

* ObjectOutputStream 

    对象输出流，可以将对象进行序列化存储
    
        ObjectOutputStream(OutputStream out) 创建写入指定OutputStream 的 ObjectOutputStream。
        
        void writeObject(Object obj) 将指定的对象写入 ObjectOutputStream。
        
    以上是ObjectOutputStream的两个常用Api，通过构造方法来创建OutputStream，然后通过writeObject()方法来写入数据
    
* ObjectInputStream
    
    对象输入流，来将硬盘上的数据进行反序列化

        ObjectInputStream(InputStream in) 创建从指定 InputStream 读取的 ObjectInputStream。
        
        Object	readObject() 从 ObjectInputStream 读取对象。
        
    以上是ObjectInputStream常用的两个Api，通过构造方法来关联InoutStream，然后用readObject()来读取文件中的对象，进行反序列化


