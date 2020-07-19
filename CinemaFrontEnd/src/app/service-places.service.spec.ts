import { TestBed } from '@angular/core/testing';

import { ServicePlacesService } from './service-places.service';

describe('ServicePlacesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServicePlacesService = TestBed.get(ServicePlacesService);
    expect(service).toBeTruthy();
  });
});
