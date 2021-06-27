import riak
riak_client = riak.RiakClient()

bucket = riak_client.bucket('s15831')

doc = {"color": "blue", "name": "Kros2", "inStore": True}
key = bucket.new('doc', doc).store()
print('New doc added')

retrieved_doc = bucket.get('doc')
print('Doc file: ' + str(retrieved_doc.data))

retrieved_doc.data['inStore'] = False
retrieved_doc.store()

updated_doc = bucket.get('doc')
print('Modify doc: ' + str(updated_doc.data))
updated_doc.delete()

deleted_doc = bucket.get('doc')
print('Deleted doc: ' + str(deleted_doc.data))